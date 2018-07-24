package com.endava.rule.dtos;

import java.io.Serializable;

/**
 * DTO for Payment Method.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public class PaymentMethodDto implements Serializable {

	private static final long serialVersionUID = -1677514087993328501L;

	private Long bankId;

	private String paymentMethod;

	public PaymentMethodDto() {
	}

	public PaymentMethodDto(Long bankId, String paymentMethod) {
		this.bankId = bankId;
		this.paymentMethod = paymentMethod;
	}

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override public String toString() {
		return "PaymentMethodRequestDto{" + "bankId='" + bankId + '\'' + ", paymentMethod='" + paymentMethod + '\'' + '}';
	}
}
