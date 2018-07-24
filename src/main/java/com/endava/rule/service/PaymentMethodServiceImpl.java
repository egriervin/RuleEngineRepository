package com.endava.rule.service;

import com.endava.rule.dataService.BankDataService;
import com.endava.rule.dataService.PaymentMethodDataService;
import com.endava.rule.dtos.PaymentMethodRequestDto;
import com.endava.rule.entities.Bank;
import com.endava.rule.entities.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service Implementation for Payment Method.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

	@Autowired PaymentMethodDataService paymentMethodDataService;

	@Autowired BankDataService bankDataService;

	@Override
	public PaymentMethod registerPaymentMethod(PaymentMethodRequestDto paymentMethodRequestDto) {

		Bank bank = bankDataService.findBankByBic(paymentMethodRequestDto.getBic());
		PaymentMethod paymentMethod = new PaymentMethod(bank.getId(), paymentMethodRequestDto.getPaymentMethod());
		return paymentMethodDataService.registerPaymentMethod(paymentMethod);
	}

	@Override
	public PaymentMethod updatePaymentMethod(PaymentMethodRequestDto paymentMethodRequestDto) {

		Bank bank = bankDataService.findBankByBic(paymentMethodRequestDto.getBic());
		return paymentMethodDataService.updatePaymentMethod(bank.getId(), paymentMethodRequestDto.getOldPaymentMethod(),
				paymentMethodRequestDto.getPaymentMethod());
	}

	@Override
	public List<PaymentMethod> findAllPaymentMethods() {
		return paymentMethodDataService.findAllPaymentMethods();
	}

	@Override
	public void removePaymentMethodByBicAndPaymentMethodName(PaymentMethodRequestDto paymentMethodRequestDto) {
		Bank bank = bankDataService.findBankByBic(paymentMethodRequestDto.getBic());
		paymentMethodDataService.removePaymentMethodByBicAndPaymentMethodName(bank.getId(), paymentMethodRequestDto.getPaymentMethod());
	}

	@Override
	public void removeAllPaymentMethodsByBic(String bic) {
		Bank bank = bankDataService.findBankByBic(bic);
		paymentMethodDataService.removeAllPaymentMethodsByBic(bank.getId());
	}

	@Override
	public List<PaymentMethod> findPaymentMethodsByBic(String bic) {
		Bank bank = bankDataService.findBankByBic(bic);
		return paymentMethodDataService.findPaymentMethodsByBank(bank.getId());
	}
}
