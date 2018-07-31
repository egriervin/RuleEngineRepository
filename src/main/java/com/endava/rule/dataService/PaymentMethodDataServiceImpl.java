package com.endava.rule.dataService;

import com.endava.rule.entities.Bank;
import com.endava.rule.entities.PaymentMethod;
import com.endava.rule.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Data service implementation for Payment Method.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Service
@Transactional
public class PaymentMethodDataServiceImpl implements PaymentMethodDataService {

	@Autowired
	PaymentMethodRepository paymentMethodRepository;

	@Override
	public void registerPaymentMethod(PaymentMethod paymentMethod) {
		paymentMethodRepository.save(paymentMethod);
	}

	@Override public List<PaymentMethod> findAllPaymentMethods() {
		return paymentMethodRepository.findAll();
	}

	@Override
	public void updatePaymentMethod(PaymentMethod paymentMethod) {
		paymentMethodRepository.save(paymentMethod);
	}

	@Override
	public void removePaymentMethod(PaymentMethod paymentMethod) {
		paymentMethodRepository.delete(paymentMethod);
	}

	@Override
	public List<PaymentMethod> findPaymentMethodsByBank(Long id) {
		return paymentMethodRepository.findByBankId(id);
	}

	@Override
	public void removeAllPaymentMethodsByBic(Long bankId) {
		paymentMethodRepository.deleteAll(paymentMethodRepository.findByBankId(bankId));
	}
}
