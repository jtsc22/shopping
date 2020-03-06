package com.shopping.service.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.shopping.entity.CustomerEntity;
import com.shopping.repository.ICustomerRepository;

@Component
public class CustomerService implements ICustomerService {
	
	 @Autowired()
	 ICustomerRepository customerRepo;
	 
	
	@Override
	public List<CustomerEntity> findAll() {
		return (List<CustomerEntity>) customerRepo.findAll();
	}


	@Override
	public CustomerEntity register(CustomerEntity entity) {
		return customerRepo.save(entity);
	}


	@Override
	public CustomerEntity findById(Long id) {
		return customerRepo.getOne(id);
	}
	

}
