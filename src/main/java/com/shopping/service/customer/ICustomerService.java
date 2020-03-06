package com.shopping.service.customer;

import java.util.List;


import com.shopping.entity.CustomerEntity;

public interface ICustomerService {
	 
	 public List<CustomerEntity> findAll();
	 public CustomerEntity register (CustomerEntity entity);
	 public CustomerEntity findById (Long id);
	 
}
