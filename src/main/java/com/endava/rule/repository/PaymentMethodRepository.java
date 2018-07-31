package com.endava.rule.repository;

import com.endava.rule.entities.PaymentMethod;
import com.sun.deploy.panel.JavaPanel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *  Repository for Payment Method.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
	List<PaymentMethod> findByBankId(Long id);
}
