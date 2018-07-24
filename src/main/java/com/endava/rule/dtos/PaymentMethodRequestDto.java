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

	private String paymentMethod;

	public PaymentMethodRequestDto() {
	}

	public PaymentMethodRequestDto(String bic, String paymentMethod) {
		this.bic = bic;
		this.paymentMethod = paymentMethod;
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

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override public String toString() {
		return "PaymentMethodRequestDto{" + "bic='" + bic + '\'' + ", paymentMethod='" + paymentMethod + '\'' + '}';
	}
}
