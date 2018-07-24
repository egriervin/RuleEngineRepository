package com.endava.rule.converters;

import com.endava.rule.dtos.ProductRequestDto;
import com.endava.rule.entities.Product;
import org.springframework.stereotype.Component;

/**
 * Converter class for Product DTO.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Component public class ProductDtoConverter {

	public Product toEntity(ProductRequestDto productRequestDto) {
		Product product = new Product();
		if (null != productRequestDto) {
			product.setName(productRequestDto.getName());
			if (null != productRequestDto.getPrice()) {
				product.setPrice(productRequestDto.getPrice());
			}
			if (null != productRequestDto.getQuantity()) {
				product.setQuantity(productRequestDto.getQuantity());
			}
		}
		return product;
	}
}
