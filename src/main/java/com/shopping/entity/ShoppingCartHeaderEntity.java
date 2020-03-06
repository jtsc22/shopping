package com.shopping.entity;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "ShoppingCartHeader", schema = "dbo")
public class ShoppingCartHeaderEntity {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "Id")
	 private Long id;
	 
	 @Column(name = "OrderNumber")
	 private String orderNumber;
	 
	 @Column(name = "IdCustomer")
	 private Integer idCustomer;
	 
	 @Column(name = "OrderDate")
	 private Date orderDate;
	 
	 @Column(name = "OrderAmount")
	 private Float orderAmount;
	 
	 @Column(name = "IsCredit")
	 private Boolean isCredit;
	 
	 @Column(name = "Active")
	 private Boolean active;
	 
	
	 @OneToMany(mappedBy = "shoppingCartHeader",  orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 private List<ShoppingCartItemsEntity> shoppingCartItems = new ArrayList<>(); ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Float getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Float orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Boolean getIsCredit() {
		return isCredit;
	}

	public void setIsCredit(Boolean isCredit) {
		this.isCredit = isCredit;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<ShoppingCartItemsEntity> getShoppingCartItems() {
		return shoppingCartItems;
	}

	public void setShoppingCartItems(List<ShoppingCartItemsEntity> shoppingCartItems) {
		this.shoppingCartItems = shoppingCartItems;
	}

	
}
