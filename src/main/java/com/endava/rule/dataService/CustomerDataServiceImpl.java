package com.endava.rule.dataService;

import com.endava.rule.converters.CustomerDtoConverter;
import com.endava.rule.dtos.CustomerRequestDto;
import com.endava.rule.entities.Account;
import com.endava.rule.entities.Bank;
import com.endava.rule.entities.Customer;
import com.endava.rule.repository.AccountRepository;
import com.endava.rule.repository.BankRepository;
import com.endava.rule.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Data service implementation for Customer.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Service @Transactional public class CustomerDataServiceImpl implements CustomerDataService {

	@Autowired CustomerRepository customerRepository;

	@Autowired AccountRepository accountRepository;

	@Autowired BankRepository bankRepository;

	@Autowired CustomerDtoConverter customerDtoConverter;

	@Override public void registerCustomer(CustomerRequestDto customerRequestDto) {

		Bank bank = bankRepository.findByBic(customerRequestDto.getBic());
		Customer customer = customerRepository.save(customerDtoConverter.toEntity(customerRequestDto));

		Account account = new Account(bank.getId(), customer.getId(), customerRequestDto.getBalance());

		accountRepository.save(account);
	}

	@Override public void updateCustomerByCic(CustomerRequestDto customerRequestDto) {
		Customer customer = customerRepository.findByCic(customerRequestDto.getCic());
		Customer newCustomer = customerDtoConverter.toEntity(customerRequestDto);

		if (!customer.equals(newCustomer)) {
			customerRepository.delete(customer);
			customer = customerRepository.save(newCustomer);
		}

		Account oldAccount = accountRepository.findByCustomerId(customer.getId());
		Long bankId = bankRepository.findByBic(customerRequestDto.getBic()).getId();

		Account newAccount = new Account(bankId, customer.getId(), customerRequestDto.getBalance());

		if (!oldAccount.equals(newAccount)) {
			accountRepository.save(newAccount);
		}
	}

	@Override public void removeCustomerByCic(String cic) {
		Customer customer = customerRepository.findByCic(cic);
		List<Account> accountList = accountRepository.findAllByCustomerId(customer.getId());

		accountRepository.deleteAll(accountList);
	}

	@Override public Customer findCustomerByCic(String cic) {
		return customerRepository.findByCic(cic);
	}
}
