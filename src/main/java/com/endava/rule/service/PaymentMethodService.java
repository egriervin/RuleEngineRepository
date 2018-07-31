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

	void registerPaymentMethod(PaymentMethodRequestDto paymentMethodRequestDto);

	void updatePaymentMethod(PaymentMethodRequestDto paymentMethodRequestDto);

	List<PaymentMethod> findAllPaymentMethods();

	void removePaymentMethod(PaymentMethodRequestDto request);

	void removeAllPaymentMethodsByBic(String bic);

	List<PaymentMethod> findPaymentMethodsByBic(String bic);
}
