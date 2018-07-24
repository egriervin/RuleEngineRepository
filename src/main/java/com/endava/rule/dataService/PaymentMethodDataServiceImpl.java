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
@Service @Transactional public class PaymentMethodDataServiceImpl implements PaymentMethodDataService {

	@Autowired PaymentMethodRepository paymentMethodRepository;

	@Override public PaymentMethod registerPaymentMethod(PaymentMethod paymentMethod) {
		return paymentMethodRepository.save(paymentMethod);
	}

	@Override public List<PaymentMethod> findAllPaymentMethods() {
		Iterable<PaymentMethod> source = paymentMethodRepository.findAll();
		List<PaymentMethod> paymentMethodList = new ArrayList<>();
		source.iterator().forEachRemaining(paymentMethodList::add);
		return paymentMethodList;
	}

	@Override public PaymentMethod updatePaymentMethod(Long bankId, String oldPaymentMethod, String newPaymentMethod) {
		List<PaymentMethod> paymentMethods = paymentMethodRepository.findByBankId(bankId);
		PaymentMethod paymentMethod = paymentMethods.stream().filter(p -> p.getPaymentMethod().equals(oldPaymentMethod)).findAny().get();
		paymentMethod.setPaymentMethod(newPaymentMethod);
		return paymentMethodRepository.save(paymentMethod);
	}

	@Override public void removePaymentMethodByBicAndPaymentMethodName(Long bankId, String paymentMethod) {
		List<PaymentMethod> paymentMethods = paymentMethodRepository.findByBankId(bankId);
		PaymentMethod method = paymentMethods.stream().filter(p -> p.getPaymentMethod().equals(paymentMethod)).findAny().get();
		paymentMethodRepository.delete(method);
	}

	@Override public List<PaymentMethod> findPaymentMethodsByBank(Long id) {
		return paymentMethodRepository.findByBankId(id);
	}

	@Override public void removeAllPaymentMethodsByBic(Long bankId) {
		paymentMethodRepository.deleteAll(paymentMethodRepository.findByBankId(bankId));
	}
}
