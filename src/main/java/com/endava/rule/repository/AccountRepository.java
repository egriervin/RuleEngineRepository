package com.endava.rule.repository;

import com.endava.rule.entities.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Repository for Account.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public interface AccountRepository extends CrudRepository<Account, Long> {
	Account findByCustomerId(Long customerId);
	List<Account> findAllByCustomerId(Long customerId);
}
