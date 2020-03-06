package com.shopping.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.shopping.entity.CustomerEntity;


public interface ICustomerRepository extends JpaRepository <CustomerEntity, Long> {}
