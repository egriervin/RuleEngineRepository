package com.endava.rule.converters;

import com.endava.rule.dtos.CustomerRequestDto;
import com.endava.rule.entities.Customer;
import org.springframework.stereotype.Component;

/**
 * Converter class for Customer DTO.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Component public class CustomerDtoConverter {

	public Customer toEntity(CustomerRequestDto customerRequestDto) {
		Customer customer = new Customer();
		if (null != customerRequestDto) {
			if (null != customerRequestDto.getName()) {
				customer.setName(customerRequestDto.getName());
			}
			if (null != customerRequestDto.getAddress()) {
				customer.setAddress(customerRequestDto.getAddress());
			}
			if (null != customerRequestDto.getCic()) {
				customer.setCic(customerRequestDto.getCic());
			}
		}
		return customer;
	}
}
