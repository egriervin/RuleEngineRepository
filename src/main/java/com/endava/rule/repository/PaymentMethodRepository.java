package com.endava.rule.repository;

import com.endava.rule.entities.PaymentMethod;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *  Repository for Payment Method.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public interface PaymentMethodRepository extends CrudRepository<PaymentMethod, Long> {

	List<PaymentMethod> findByBankId(Long id);
}
