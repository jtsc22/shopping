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

import com.shopping.entity.CustomerEntity;
import com.shopping.repository.ICustomerRepository;
import com.shopping.service.customer.ICustomerService;

@RestController
@RequestMapping("/api/v1/")
public class CustomerController {

	 @Autowired
	 private ICustomerService customerService;

    
    @GetMapping("/customers")
    public ResponseEntity<List<CustomerEntity>> findAll() {
    	   return  ResponseEntity.ok().body(customerService.findAll());
    }
    
    @GetMapping("/customers/{id}")
    public ResponseEntity<CustomerEntity>findById(@PathVariable(value = "id") Long customerId) {
   	   return  ResponseEntity.ok().body(customerService.findById(customerId));
    	
    }
    
    @PostMapping("/customers")
    public ResponseEntity<CustomerEntity> register(@Valid @RequestBody CustomerEntity customer) {
		return ResponseEntity.ok().body(customerService.register(customer));
    	
    }
}
