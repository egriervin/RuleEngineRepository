package com.endava.rule.dtos;

import java.io.Serializable;

/**
 * Request DTO for Bank.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public class BankRequestDto implements Serializable {

	private static final long serialVersionUID = 7645670394008654364L;

	private String name;

	private String bic;

	public BankRequestDto() {
	}

	public BankRequestDto(String name, String bic) {
		this.name = name;
		this.bic = bic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	@Override public String toString() {
		return "BankRequestDto{" + "name='" + name + '\'' + ", bic='" + bic + '\'' + '}';
	}
}
