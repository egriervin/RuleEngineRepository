package com.endava.rule.controller;

import com.endava.rule.dtos.PaymentMethodRequestDto;
import com.endava.rule.entities.PaymentMethod;
import com.endava.rule.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

/**
 * API class for Payment Methods.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@RestController public class PaymentMethodAPI {

	@Autowired PaymentMethodService paymentMethodService;

	@RequestMapping(value = "/registerPaymentMethod", method = RequestMethod.POST)
	public ResponseEntity<?> registerPaymentMethod(@RequestBody PaymentMethodRequestDto request) {
		paymentMethodService.registerPaymentMethod(request);
		return new ResponseEntity<>(null, OK);
	}

	@RequestMapping(value = "/findAllPaymentMethods", method = RequestMethod.GET)
	public ResponseEntity<?> findAllPaymentMethods(){
		List<PaymentMethod> paymentMethodList = paymentMethodService.findAllPaymentMethods();
		return new ResponseEntity<>(paymentMethodList, OK);
	}

	@RequestMapping(value = "/updatePaymentMethod", method = RequestMethod.PUT)
	public ResponseEntity<?> updatePaymentMethod(@RequestBody PaymentMethodRequestDto request){
		paymentMethodService.updatePaymentMethod(request);
		return new ResponseEntity<>(null, OK);
	}

	@RequestMapping(value = "/findPaymentMethodsByBic", method = RequestMethod.POST)
	public ResponseEntity<?> findPaymentMethodByBic(@RequestBody PaymentMethodRequestDto request){
		List<PaymentMethod> paymentMethodList = paymentMethodService.findPaymentMethodsByBic(request.getBic());
		return new ResponseEntity<>(paymentMethodList, OK);
	}

	@RequestMapping(value = "/removePaymentMethodByBicAndPaymentMethodName", method = RequestMethod.POST)
	public ResponseEntity<?> removePaymentMethod(@RequestBody PaymentMethodRequestDto request){
		paymentMethodService.removePaymentMethod(request);
		return new ResponseEntity<>(null, OK);
	}

	@RequestMapping(value = "/removeAllPaymentMethodsByBic", method = RequestMethod.POST)
	public ResponseEntity<?> removeAllPaymentMethodsByBic(@RequestBody PaymentMethodRequestDto request){
		paymentMethodService.removeAllPaymentMethodsByBic(request.getBic());
		return new ResponseEntity<>(null, OK);
	}
}
