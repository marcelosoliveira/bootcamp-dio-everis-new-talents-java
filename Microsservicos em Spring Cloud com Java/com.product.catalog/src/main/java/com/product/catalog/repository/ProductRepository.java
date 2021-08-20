package com.product.catalog.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.catalog.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
	List<Product> findAll();
}
