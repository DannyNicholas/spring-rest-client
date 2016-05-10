package com.scottlogic.spring_microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductDetailController {
	private final ProductDetailRepository repository;

	@Autowired
	public ProductDetailController(ProductDetailRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<ProductDetail> findAll() {
		return repository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public ProductDetail create(@RequestBody ProductDetail detail) {
		return repository.save(detail);
	}
}