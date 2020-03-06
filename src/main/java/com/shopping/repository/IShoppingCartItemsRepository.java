package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entity.ShoppingCartItemsEntity;

public interface IShoppingCartItemsRepository extends JpaRepository <ShoppingCartItemsEntity, Long>{ }
