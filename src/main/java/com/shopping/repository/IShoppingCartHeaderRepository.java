package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shopping.entity.ShoppingCartHeaderEntity;

public interface IShoppingCartHeaderRepository extends JpaRepository <ShoppingCartHeaderEntity, Long> {

	 public ShoppingCartHeaderEntity findByIdCustomer(Integer id);
}
