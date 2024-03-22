package com.productapp.service;

import java.util.List;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductService {

	void addproduct(Product product);
	void updateproduct(int  productId,double price);
	void deleteproduct(int productId);
	Product getById(int productId)throws ProductNotFoundException;
	List<Product> getAll();
	List<Product> getByBrand(String brand)throws ProductNotFoundException;
	List<Product> getByLessprice(double price)throws ProductNotFoundException;
	List<Product> getByCategoryandprice(String category, double price)throws ProductNotFoundException;
	
}
