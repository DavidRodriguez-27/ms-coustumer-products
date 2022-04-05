package com.bootcamp.ms.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.ms.models.dao.CustomersProductsDao;
import com.bootcamp.ms.models.documents.CustomersProducts;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomersProductsServiceImpl implements CustomersProductsService{

	@Autowired
	private CustomersProductsDao dao;

	@Override
	public Flux<CustomersProducts> findAll() {
		return dao.findAll();
	}

	@Override
	public Mono<CustomersProducts> findById(String id) {
		return dao.findById(id);
	}

	@Override
	public Mono<CustomersProducts> save(CustomersProducts ClienteProducto) {
		return dao.save(ClienteProducto);
	}

	@Override
	public Mono<Void> delete(CustomersProducts ClienteProducto) {
		return dao.delete(ClienteProducto);
	}

	
}
