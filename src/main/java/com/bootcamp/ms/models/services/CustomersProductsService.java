package com.bootcamp.ms.models.services;

import com.bootcamp.ms.models.documents.Customers;
import com.bootcamp.ms.models.documents.CustomersProducts;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomersProductsService {
	

	public Flux<CustomersProducts> findAll();
	
	public Mono<CustomersProducts> findById(String id);
	
	public Mono<CustomersProducts> save(CustomersProducts ClienteProducto);
	
	public Mono<Void> delete(CustomersProducts ClienteProducto);
	

}

