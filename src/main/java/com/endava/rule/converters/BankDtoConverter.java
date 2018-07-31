package com.endava.rule.converters;

import com.endava.rule.dtos.BankRequestDto;
import com.endava.rule.entities.Bank;
import org.springframework.stereotype.Component;

/**
 * Converter class for Bank DTO.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Component
public class BankDtoConverter {

	public Bank toEntity(BankRequestDto bankRequestDto) {
		Bank bank = new Bank();
		if (null != bankRequestDto) {
			if (null != bankRequestDto.getName()) {
				bank.setName(bankRequestDto.getName());
			}
			if (null != bankRequestDto.getBic()) {
				bank.setBic(bankRequestDto.getBic());
			}
		}
		return bank;
	}
}
