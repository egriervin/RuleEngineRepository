package com.endava.rule.converters;

import com.endava.rule.dtos.PaymentMethodDto;
import com.endava.rule.dtos.PaymentMethodRequestDto;
import com.endava.rule.entities.PaymentMethod;
import org.springframework.stereotype.Component;

/**
 * Converter class for Payment Method DTO.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Component
public class PaymentMethodConverter {

	public PaymentMethod toEntity(PaymentMethodDto paymentMethodDto){
		PaymentMethod paymentMethod = new PaymentMethod();
		if(null != paymentMethodDto){
			paymentMethod.setBankId(paymentMethodDto.getBankId());
			paymentMethod.setPaymentMethod(paymentMethodDto.getPaymentMethod());
		}
		return paymentMethod;
	}
}
