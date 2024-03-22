package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;
@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	IProductRepository productRepository;

	@Override
	public void addproduct(Product product) {
		productRepository.addproduct(product);
	}

	@Override
	public void updateproduct(int productId, double price) {
		productRepository.updateproduct(productId, price);
		
	}

	@Override
	public void deleteproduct(int productId) {
		productRepository.deleteproduct(productId);
		
	}

	@Override
	public Product getById(int productId) throws ProductNotFoundException {
		
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByBrand(String brand) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByLessprice(double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByCategoryandprice(String category, double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}