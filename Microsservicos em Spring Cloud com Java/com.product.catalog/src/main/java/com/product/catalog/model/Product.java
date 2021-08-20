package com.product.catalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(indexName = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	private Long id;	
	private String name;
	private Integer amount;

}
