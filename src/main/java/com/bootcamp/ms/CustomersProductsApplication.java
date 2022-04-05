package com.bootcamp.ms;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import com.bootcamp.ms.models.documents.Customers;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class CustomersProductsApplication  {
	
	@Autowired
	private ReactiveMongoTemplate mongoTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(CustomersProductsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CustomersProductsApplication.class, args);
	}
	

}
