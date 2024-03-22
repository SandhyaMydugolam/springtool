package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}
	@Autowired
	private IProductService productService;

	@Override
	public void run(String... args) throws Exception {
		 Product product = new Product();
		 product.setProductId(111123);
		 product.setProductName("Munch");
		 product.setBrand("eclairs");
		 product.setPrice(250);
		 product.setCategory("choclates");
		 
		
	}

}
