package com.shopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "products", schema = "dbo")
public class ProductEntity {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "Id", updatable = false, nullable = false)
	 private Long id;
	 
	 @Column(name = "IdProductCategory")
	 private Integer idProductCategory;
	 
	 @Column(name = "ProductCode")
	 private String productCode;
	 
	 @Column(name = "Price")
	 private Float price;
	 
	 @Column(name = "Available")
	 private Integer available;
	 
	 @Column(name = "Orders")
	 private Integer orders;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdProductCategory() {
		return idProductCategory;
	}

	public void setIdProductCategory(Integer idProductCategory) {
		this.idProductCategory = idProductCategory;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public Integer getOrders() {
		return orders;
	}

	public void setOrders(Integer orders) {
		this.orders = orders;
	}
	 
}
	    		  