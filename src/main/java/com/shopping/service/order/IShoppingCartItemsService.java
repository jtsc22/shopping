package com.shopping.service.order;


import java.util.List;

import com.shopping.entity.ShoppingCartHeaderEntity;
import com.shopping.entity.ShoppingCartItemsEntity;

public interface IShoppingCartItemsService {

	 public ShoppingCartItemsEntity registerCartItems (ShoppingCartItemsEntity entity);
	 public ShoppingCartHeaderEntity registerCartHeader (ShoppingCartHeaderEntity entity);
	 public ShoppingCartHeaderEntity findByCustomerId (Integer id);
	 public List<ShoppingCartHeaderEntity> findAll ();
	 
}
