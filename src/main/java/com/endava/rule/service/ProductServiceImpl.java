package com.endava.rule.service;

import com.endava.rule.converters.ProductDtoConverter;
import com.endava.rule.dataService.ProductDataService;
import com.endava.rule.dtos.ProductRequestDto;
import com.endava.rule.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service Implementation for Product.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDataService productDataService;

	@Autowired
	ProductDtoConverter productDtoConverter;

	@Override
	public Product registerProduct(ProductRequestDto productRequestDto) {
		return productDataService.registerProduct(productDtoConverter.toEntity(productRequestDto));
	}

	@Override
	public Product updateProduct(ProductRequestDto productRequestDto) {
		return productDataService.updateProduct(productDtoConverter.toEntity(productRequestDto));
	}

	@Override
	public List<Product> findAllProducts() {
		return productDataService.findAllProducts();
	}

	@Override
	public void removeProductByName(String name) {
		productDataService.removeProduct(name);
	}

	@Override
	public Product findProductByName(String name) {
		return productDataService.findProductByName(name);
	}
}
