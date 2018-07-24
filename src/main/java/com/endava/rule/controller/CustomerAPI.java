package com.endava.rule.controller;

import com.endava.rule.dtos.CustomerRequestDto;
import com.endava.rule.entities.Customer;
import com.endava.rule.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

/**
 * API class for Customers.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@RestController public class CustomerAPI {

	@Autowired CustomerService customerService;

	@RequestMapping(value = "/registerCustomer", method = RequestMethod.POST)
	public ResponseEntity<?> registerCustomer(@RequestBody CustomerRequestDto request) {
		Customer customer = customerService.registerCustomer(request);
		return new ResponseEntity<>(customer, OK);
	}

	@RequestMapping(value = "/updateCustomerByCic", method = RequestMethod.PUT)
	public ResponseEntity<?> updateCustomerByCic(@RequestBody CustomerRequestDto request){
		Customer customer = customerService.updateCustomerByCic(request);
		return new ResponseEntity<>(customer, OK);
	}

	@RequestMapping(value = "/findCustomerByCic", method = RequestMethod.POST)
	public ResponseEntity<?> findCustomerByCic(@RequestBody CustomerRequestDto request){
		Customer customer = customerService.findCustomerByCic(request.getCic());
		return new ResponseEntity<>(customer, OK);
	}

	@RequestMapping(value = "/removeCustomerByCic", method = RequestMethod.POST)
	public ResponseEntity<?> removeCustomerByCic(@RequestBody CustomerRequestDto request){
		customerService.removeCustomerByCic(request.getCic());
		return new ResponseEntity<>(null, OK);
	}
}
