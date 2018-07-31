package com.endava.rule.service;

import com.endava.rule.dtos.ProductRequestDto;
import com.endava.rule.entities.Product;

import java.util.List;

/**
 * Interface for Product Service.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */

public interface ProductService {

	void registerProduct(ProductRequestDto productRequestDto);

	void updateProduct(ProductRequestDto productRequestDto);

	List<Product> findAllProducts();

	void removeProductByName(String name);

	Product findProductByName(String name);
}
