package com.shopping.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.ProductEntity;
import com.shopping.service.product.IProductService;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {

	 @Autowired
	 private IProductService productService;
	 
	 @GetMapping("/products")
	    public ResponseEntity<List<ProductEntity>> findAll() {
	    	   return  ResponseEntity.ok().body(productService.findAll());
	    }
}
