package com.endava.rule.service;

import com.endava.rule.converters.BankDtoConverter;
import com.endava.rule.dataService.BankDataService;
import com.endava.rule.dtos.BankRequestDto;
import com.endava.rule.entities.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service Implementation for Bank.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankDataService bankDataService;

	@Autowired
	BankDtoConverter bankDtoConverter;

	@Override
	public Bank registerBank(BankRequestDto bankRequestDto) {
		return bankDataService.registerBank(bankDtoConverter.toEntity(bankRequestDto));
	}

	@Override
	public Bank updateBank(BankRequestDto bankRequestDto) {
		return bankDataService.updateBank(bankDtoConverter.toEntity(bankRequestDto));
	}

	@Override
	public List<Bank> findAllBanks() {
		return bankDataService.findAllBanks();
	}

	@Override
	public void removeBankByBic(String bic) {
		bankDataService.removeBank(bic);
	}

	@Override
	public Bank findBankByBic(String bic) {
		return bankDataService.findBankByBic(bic);
	}
}
