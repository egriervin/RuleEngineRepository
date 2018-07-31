package com.endava.rule.dataService;

import com.endava.rule.entities.PaymentMethod;

import java.util.List;

/**
 * Payment Method Data Service Interface.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public interface PaymentMethodDataService {

	void registerPaymentMethod(PaymentMethod paymentMethod);

	List<PaymentMethod> findAllPaymentMethods();

	void updatePaymentMethod(PaymentMethod paymentMethod);

	void removePaymentMethod(PaymentMethod paymentMethod);

	List<PaymentMethod> findPaymentMethodsByBank(Long id);

	void removeAllPaymentMethodsByBic(Long bankId);
}
