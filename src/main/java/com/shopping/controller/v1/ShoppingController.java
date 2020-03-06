package com.shopping.controller.v1;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shopping.entity.ShoppingCartHeaderEntity;
import com.shopping.service.order.IShoppingCartItemsService;


@RestController
@RequestMapping("/api/v1/")
public class ShoppingController {

	 @Autowired
	 private IShoppingCartItemsService shoppingService;
	
	 @PostMapping("/shoppings")
	 public ResponseEntity<ShoppingCartHeaderEntity> register(@Valid @RequestBody ShoppingCartHeaderEntity shopping) {		 		
	  return ResponseEntity.ok().body(shoppingService.registerCartHeader(shopping));
	    	
	  }
	 
	 
	 @GetMapping("/shoppings/{id}/customer")
	    public ResponseEntity<ShoppingCartHeaderEntity> findByCustomerId(@PathVariable(value = "id") Integer customerId) {
	   	   return  ResponseEntity.ok().body(shoppingService.findByCustomerId(customerId));
	    	
	 }
}
