package com.endava.rule.repository;

import com.endava.rule.entities.Product;
import org.springframework.data.repository.CrudRepository;

/**
 *  Repository for Product.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
	Product findByName(String name);
}
