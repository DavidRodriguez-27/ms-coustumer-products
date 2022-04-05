package com.bootcamp.ms.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.ms.models.documents.CustomersProducts;

public interface CustomersProductsDao extends ReactiveMongoRepository<CustomersProducts, String>{

}
