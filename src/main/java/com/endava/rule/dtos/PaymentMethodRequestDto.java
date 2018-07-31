package com.endava.rule.dtos;

import java.io.Serializable;

/**
 * Request DTO for Payment Method.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public class PaymentMethodRequestDto implements Serializable {

	private static final long serialVersionUID = 7645670394008654364L;

	private String bic;

	private String oldPaymentMethod;

	private String paymentMethodName;

	public PaymentMethodRequestDto() {
	}

	public PaymentMethodRequestDto(String bic, String paymentMethodName) {
		this.bic = bic;
		this.paymentMethodName = paymentMethodName;
	}

	public String getOldPaymentMethod() {
		return oldPaymentMethod;
	}

	public void setOldPaymentMethod(String oldPaymentMethod) {
		this.oldPaymentMethod = oldPaymentMethod;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getPaymentMethodName() {
		return paymentMethodName;
	}

	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}

	@Override public String toString() {
		return "PaymentMethodRequestDto{" + "bic='" + bic + '\'' + ", paymentMethodName='" + paymentMethodName + '\'' + '}';
	}
}
