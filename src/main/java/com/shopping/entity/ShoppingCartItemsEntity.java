package com.shopping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "ShoppingCartItems", schema = "dbo")
public class ShoppingCartItemsEntity {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "Id", updatable = false, nullable = false)
	 private Long id;
	 
	 @Column(name = "IdOrder")
	 private Long idOrder;
	 
	 @Column(name = "Row")
	 private String row;
	 
	 @Column(name = "IdProduct")
	 private Integer idProduct;
	 
	 @Column(name = "Description")
	 private String description;
	 
	 @Column(name = "Qty")
	 private Integer qty;
	 
	 @Column(name = "Price")
	 private Float price;
	 
	 @Column(name = "Total")
	 private Float total;

	 @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.PERSIST)
	 @JoinColumn (name="IdOrder",referencedColumnName="Id", updatable = false, insertable = false, nullable = false)
	 @JsonIgnore
	 private ShoppingCartHeaderEntity shoppingCartHeader;
	   
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdOrder() {
		return idOrder ;
	}

	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder ;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = qty * price;
	}

	public ShoppingCartHeaderEntity getShoppingCartHeader() {
		return shoppingCartHeader;
	}

	public void setShoppingCartHeader(ShoppingCartHeaderEntity shoppingCartHeader) {
		this.shoppingCartHeader = shoppingCartHeader;
	}
	
}


