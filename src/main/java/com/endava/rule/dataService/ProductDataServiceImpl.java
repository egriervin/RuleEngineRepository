package com.endava.rule.dataService;

import com.endava.rule.entities.Product;
import com.endava.rule.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Data service implementation for Product.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@Service
@Transactional
public class ProductDataServiceImpl implements ProductDataService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void registerProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public List<Product> findAllProducts() {
		Iterable<Product> source = productRepository.findAll();
		List<Product> productList = new ArrayList<>();
		source.iterator().forEachRemaining(productList::add);
		return productList;
	}

	@Override
	public void updateProduct(Product productDetails) {
		Product oldProductDetails = productRepository.findByName(productDetails.getName());
		productRepository.save(productDetails);
	}

	@Override
	public void removeProduct(String name) {
		Product oldProduct = productRepository.findByName(name);
		productRepository.delete(oldProduct);
	}

	@Override
	public Product findProductByName(String name) {
		return productRepository.findByName(name);
	}
}
