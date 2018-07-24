package com.endava.rule.dataService;

import com.endava.rule.dtos.CustomerRequestDto;
import com.endava.rule.entities.Customer;

import java.util.List;

/**
 * Customer Data Service Interface.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public interface CustomerDataService {

	Customer registerCustomer(CustomerRequestDto customer);

	Customer updateCustomerByCic(CustomerRequestDto customer);

	void removeCustomerByCic(String cic);

	Customer findCustomerByCic(String cic);
}
