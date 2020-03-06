package com.shopping.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.ProductEntity;

import com.shopping.repository.IProductRepository;

@Service
public class ProductService implements IProductService {
	
	@Autowired()
	IProductRepository productRepo;	 

	@Override
	public List<ProductEntity> findAll() {
		return productRepo.findAll();
	}


}
