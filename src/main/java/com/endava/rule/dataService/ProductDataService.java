package com.endava.rule.dataService;

import com.endava.rule.entities.Product;

import java.util.List;

/**
 * Product Data Service Interface.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public interface ProductDataService {

	Product registerProduct(Product product);

	List<Product> findAllProducts();

	Product updateProduct(Product product);

	void removeProduct(String name);

	Product findProductByName(String name);
}
