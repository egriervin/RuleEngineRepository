package com.endava.rule.service;

import com.endava.rule.dataService.CustomerDataService;
import com.endava.rule.dtos.CustomerRequestDto;
import com.endava.rule.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service Implementation for Customer.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDataService customerDataService;

	@Override
	public void registerCustomer(CustomerRequestDto customerRequestDto) {
		customerDataService.registerCustomer(customerRequestDto);
	}

	@Override
	public void updateCustomerByCic(CustomerRequestDto customerRequestDto) {
		customerDataService.updateCustomerByCic(customerRequestDto);
	}

	@Override
	public void removeCustomerByCic(String cic) {
		customerDataService.removeCustomerByCic(cic);
	}

	@Override
	public Customer findCustomerByCic(String cic) {
		return customerDataService.findCustomerByCic(cic);
	}
}
