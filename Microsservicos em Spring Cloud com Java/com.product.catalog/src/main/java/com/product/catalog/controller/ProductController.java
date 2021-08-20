package com.product.catalog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.catalog.model.Product;
import com.product.catalog.repository.ProductRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
	
	private ProductRepository productRepository;
	
	@GetMapping("/all")
	public List<Product> listProduct() {
		return productRepository.findAll();
	}
	
	@PostMapping("/create")
	public Product createProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@GetMapping("/{id}")
	public Optional<Product> findByProduct(@PathVariable Long id) {
		return productRepository.findById(id);
	}

}
