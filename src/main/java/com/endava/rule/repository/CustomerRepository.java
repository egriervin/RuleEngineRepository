package com.endava.rule.repository;

import com.endava.rule.entities.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 *  Repository for Customer.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	Customer findByCic(String cic);
}
