package com.endava.rule.dataService;

import com.endava.rule.entities.Bank;

import java.util.List;

/**
 * Bank Data Service Interface.
 *
 * @author Ervin Egri
 * @since 1.0.0
 *
 */
public interface BankDataService {

	void registerBank(Bank bank);

	List<Bank> findAllBanks();

	void updateBank(Bank bank);

	void removeBank(String bic);

	Bank findBankByBic(String bic);
}
