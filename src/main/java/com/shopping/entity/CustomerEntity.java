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
@Table(name = "customers", schema = "dbo")
public class CustomerEntity {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "Id", updatable = false, nullable = false)
	 private Long id;
	 
	 @Column(name = "DocumentNumber")
	 private String documentNumber;
	 
	 @Column(name = "FullName")
	 private String fullName;
	 
	 @Column(name = "CreditLimit")
	 private String creditLimit;

	 
	public String getCreditLimit() {
		return creditLimit;
	}


	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getDocumentNumber() {
		return documentNumber;
	}


	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

}
