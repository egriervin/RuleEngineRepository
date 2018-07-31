package com.endava.rule.dataService;

import com.endava.rule.entities.Bank;
import com.endava.rule.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Data service implementation for Bank.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Service
@Transactional
public class BankDataServiceImpl implements BankDataService {

	@Autowired
	BankRepository bankRepository;

	@Override
	public void registerBank(Bank bank) {
		bankRepository.save(bank);
	}

	@Override
	public List<Bank> findAllBanks() {
		Iterable<Bank> source = bankRepository.findAll();
		List<Bank> bankList = new ArrayList<>();
		source.iterator().forEachRemaining(bankList::add);
		return bankList;
	}

	@Override
	public void updateBank(Bank newBankDetails) {
		Bank oldBankDetails = bankRepository.findByBic(newBankDetails.getBic());
		bankRepository.delete(oldBankDetails);
		bankRepository.save(newBankDetails);
	}

	@Override
	public void removeBank(String bic) {
		Bank oldBank = bankRepository.findByBic(bic);
		bankRepository.delete(oldBank);
	}

	@Override
	public Bank findBankByBic(String bic) {
		return bankRepository.findByBic(bic);
	}
}
