package com.shopping.cart.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.cart.model.Item;
import com.shopping.cart.model.ShoppingCart;
import com.shopping.cart.repository.ShoppingCartRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ShoppingCartController {
	
	private ShoppingCartRepository shoppingCartRepository;
	
	@PostMapping("cart/{id}")
    public ResponseEntity<Object> addItemController(@PathVariable Long id, @RequestBody Item item) {
		ShoppingCart cart;
        Optional<ShoppingCart> savedCart = shoppingCartRepository.findById(id);

        if (savedCart.isPresent()) {
            cart = savedCart.get();
        }
        else {
            cart = new ShoppingCart(id);
        }
        cart.getItems().add(item);
        ShoppingCart cartSaved = shoppingCartRepository.save(cart);
        return ResponseEntity.ok().body(cartSaved);
        
    }

    @GetMapping("cart/{id}")
    public Optional<ShoppingCart> findByIdController(@PathVariable Long id) {
        return shoppingCartRepository.findById(id);
    }

    @DeleteMapping("cart/{id}")
    public ResponseEntity<?> clearCartController(@PathVariable Long id) {
    	shoppingCartRepository.deleteById(id);
        return ResponseEntity.status(204).body("");
    }

}
