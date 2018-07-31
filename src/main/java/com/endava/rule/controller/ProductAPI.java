package com.endava.rule.controller;

import com.endava.rule.dtos.ProductRequestDto;
import com.endava.rule.entities.Product;
import com.endava.rule.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

/**
 * API class for Products.
 *
 * @author Ervin Egri
 * @since 1.0.0
 */
@RestController public class ProductAPI {

	@Autowired ProductService productService;

	@RequestMapping(value = "/registerProduct", method = RequestMethod.POST)
	public ResponseEntity<?> registerProduct(@RequestBody ProductRequestDto request) {
		productService.registerProduct(request);
		return new ResponseEntity<>(null, OK);
	}

	@RequestMapping(value = "/findAllProducts", method = RequestMethod.GET)
	public ResponseEntity<?> findAllProducts(){
		List<Product> productList = productService.findAllProducts();
		return new ResponseEntity<>(productList, OK);
	}

	@RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
	public ResponseEntity<?> updateProduct(@RequestBody ProductRequestDto request){
		productService.updateProduct(request);
		return new ResponseEntity<>(null, OK);
	}

	@RequestMapping(value = "/findProductByName", method = RequestMethod.POST)
	public ResponseEntity<?> findProductByName(@RequestBody ProductRequestDto request){
		Product product = productService.findProductByName(request.getName());
		return new ResponseEntity<>(product, OK);
	}

	@RequestMapping(value = "/removeProductByName", method = RequestMethod.POST)
	public ResponseEntity<?> removeProductByName(@RequestBody ProductRequestDto request){
		productService.removeProductByName(request.getName());
		return new ResponseEntity<>(null, OK);
	}
}
