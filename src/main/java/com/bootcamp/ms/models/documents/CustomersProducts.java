package com.bootcamp.ms.models.documents;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection="clientesProductos")
public class CustomersProducts{
	
	@Id
	//@NotEmpty
	private String id;
			
	@Valid
	private Customers customers;
	
	@Valid
	private Products products;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;
	
	public CustomersProducts() {}
	

	public CustomersProducts(Customers customers, Products products, Date createAt) {		
		this.customers = customers;
		this.products = products;
		this.createAt = createAt;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Customers getClientes() {
		return customers;
	}
	public void setClientes(Customers customers) {
		this.customers = customers;
	}
	
	public Products getProductos() {
		return products;
	}
	public void setProductos(Products products) {
		this.products = products;
	}
	
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
}
