package com.shopping.service.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.ShoppingCartHeaderEntity;
import com.shopping.entity.ShoppingCartItemsEntity;
import com.shopping.repository.IShoppingCartHeaderRepository;
import com.shopping.repository.IShoppingCartItemsRepository;

@Service
public class ShoppingCartItemsService implements IShoppingCartItemsService {

	@Autowired()
	IShoppingCartItemsRepository shoppingItemsRepo;	
	@Autowired()
	IShoppingCartHeaderRepository shoppingHeaderRepo;
	
	@Override
	public ShoppingCartItemsEntity registerCartItems(ShoppingCartItemsEntity entity) {
		 return shoppingItemsRepo.save(entity);
	}

	@Override
	public ShoppingCartHeaderEntity registerCartHeader(ShoppingCartHeaderEntity entity) {
			shoppingHeaderRepo.save(entity);
			entity.getShoppingCartItems().forEach(f -> f.setIdOrder(entity.getId()));
			shoppingItemsRepo.saveAll(entity.getShoppingCartItems());
		 return entity;
	}

	@Override
	public List<ShoppingCartHeaderEntity> findAll() {
		 return shoppingHeaderRepo.findAll();
	}

	@Override
	public ShoppingCartHeaderEntity findByCustomerId(Integer id) {
		return shoppingHeaderRepo.findByIdCustomer(id);
	}

}
