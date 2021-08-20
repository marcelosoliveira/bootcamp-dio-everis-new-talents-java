package com.shopping.cart.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@RedisHash("shoppingcart")
public class ShoppingCart {
	
	@Id
	private Long id;
	private List<Item> items;
	
	public ShoppingCart(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Item> getItems() {
		if (items == null) {
			items = new ArrayList<Item>();
		}
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
