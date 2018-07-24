package com.endava.rule.service;

import com.endava.rule.dtos.PaymentMethodRequestDto;
import com.endava.rule.entities.PaymentMethod;

import java.util.List;

/**
 * Interface for Payment Method Service.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */

public interface PaymentMethodService {

	PaymentMethod registerPaymentMethod(PaymentMethodRequestDto paymentMethodRequestDto);

	PaymentMethod updatePaymentMethod(PaymentMethodRequestDto paymentMethodRequestDto);

	List<PaymentMethod> findAllPaymentMethods();

	void removePaymentMethodByBicAndPaymentMethodName(PaymentMethodRequestDto request);

	void removeAllPaymentMethodsByBic(String bic);

	List<PaymentMethod> findPaymentMethodsByBic(String bic);
}
