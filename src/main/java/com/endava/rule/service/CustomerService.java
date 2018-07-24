package com.endava.rule.service;

import com.endava.rule.dtos.CustomerRequestDto;
import com.endava.rule.entities.Customer;

import java.util.List;

/**
 * Interface for Customer Service.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */

public interface CustomerService {

	Customer registerCustomer(CustomerRequestDto customerRequestDto);

	Customer updateCustomerByCic(CustomerRequestDto customerRequestDto);

	void removeCustomerByCic(String name);

	Customer findCustomerByCic(String name);
}
