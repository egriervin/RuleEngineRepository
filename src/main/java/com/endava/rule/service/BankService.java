package com.endava.rule.service;

import com.endava.rule.dtos.BankRequestDto;
import com.endava.rule.entities.Bank;

import java.util.List;

/**
 * Interface for Bank Service.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */

public interface BankService {

	Bank registerBank(BankRequestDto bankRequestDto);

	Bank updateBank(BankRequestDto bankRequestDto);

	List<Bank> findAllBanks();

	void removeBankByBic(String bic);

	Bank findBankByBic(String bic);
}
