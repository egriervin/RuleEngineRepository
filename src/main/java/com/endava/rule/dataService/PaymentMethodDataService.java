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

	PaymentMethod registerPaymentMethod(PaymentMethod paymentMethod);

	List<PaymentMethod> findAllPaymentMethods();

	PaymentMethod updatePaymentMethod(Long bankId, String oldPaymentMethod, String newPaymentMethod);

	void removePaymentMethodByBicAndPaymentMethodName(Long bankId, String paymentMethod);

	List<PaymentMethod> findPaymentMethodsByBank(Long id);

	void removeAllPaymentMethodsByBic(Long bankId);
}
