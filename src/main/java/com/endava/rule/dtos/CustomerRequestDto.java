package com.endava.rule.dtos;

import java.io.Serializable;

/**
 * Request DTO for Customer.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public class CustomerRequestDto implements Serializable {

	private static final long serialVersionUID = -2658996678792329919L;

	private String name;

	private String address;

	private String cic;

	private String bic;

	private double balance;


	public CustomerRequestDto() {
	}

	public CustomerRequestDto(String name, String address, String cic, String bic, double balance) {
		this.name = name;
		this.address = address;
		this.cic = cic;
		this.bic = bic;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCic() {
		return cic;
	}

	public void setCic(String cic) {
		this.cic = cic;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override public String toString() {
		return "CustomerRequestDto{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", cic='" + cic + '\'' + ", bic='" + bic + '\'' + ", balance=" + balance + '}';
	}
}
