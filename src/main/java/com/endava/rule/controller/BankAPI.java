package com.endava.rule.controller;

import com.endava.rule.dtos.BankRequestDto;
import com.endava.rule.entities.Bank;
import com.endava.rule.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

/**
 * API class for Banks.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */

@RestController public class BankAPI {

	@Autowired
	BankService bankService;

	@RequestMapping(value = "/registerBank", method = RequestMethod.POST)
	public ResponseEntity<?> registerBank(@RequestBody BankRequestDto request) {
		bankService.registerBank(request);
		return new ResponseEntity<>(null, OK);
	}

	@RequestMapping(value = "/findAllBanks", method = RequestMethod.GET)
	public ResponseEntity<?> findAllBanks(){
		List<Bank> bankList = bankService.findAllBanks();
		return new ResponseEntity<>(bankList, OK);
	}

	@RequestMapping(value = "/updateBank", method = RequestMethod.PUT)
	public ResponseEntity<?> updateBank(@RequestBody BankRequestDto request){
		bankService.updateBank(request);
		return new ResponseEntity<>(null, OK);
	}

	@RequestMapping(value = "/findBankByBic", method = RequestMethod.POST)
	public ResponseEntity<?> findBankByBic(@RequestBody BankRequestDto request){
		Bank bank = bankService.findBankByBic(request.getBic());
		return new ResponseEntity<>(bank, OK);
	}

	@RequestMapping(value = "/removeBankByBic", method = RequestMethod.POST)
	public ResponseEntity<?> removeBankByBic(@RequestBody BankRequestDto request){
		bankService.removeBankByBic(request.getBic());
		return new ResponseEntity<>(null, OK);
	}
}
