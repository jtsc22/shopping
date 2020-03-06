package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entity.ProductEntity;

public interface IProductRepository extends JpaRepository <ProductEntity, Long> {}
