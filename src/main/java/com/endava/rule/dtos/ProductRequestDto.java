package com.endava.rule.dtos;

import java.io.Serializable;

/**
 * Request DTO for Product.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public class ProductRequestDto implements Serializable {

	private static final long serialVersionUID = 7497525787127958618L;

	private String name;

	private String quantity;

	private Double price;

	public ProductRequestDto() {
	}

	public ProductRequestDto(String name, String quantity, Double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override public String toString() {
		return "ProductRequestDto{" + "name='" + name + '\'' + ", quantity='" + quantity + '\'' + ", price=" + price + '}';
	}
}
