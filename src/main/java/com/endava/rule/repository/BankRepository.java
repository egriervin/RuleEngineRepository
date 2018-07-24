package com.endava.rule.repository;

import com.endava.rule.entities.Bank;
import org.springframework.data.repository.CrudRepository;

/**
 *  Repository for Bank.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public interface BankRepository extends CrudRepository<Bank, Long> {

	Bank findByBic(String bic);

	String deleteByBic(String bic);
	Bank findBankByBic(String bic);
}
