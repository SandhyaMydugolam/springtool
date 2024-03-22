package com.productapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductRepository  {
	
	
	@Insert("insert into product(product_id,product_name,brand,price,category) values(#{productId},#{productName},#{brand},#{price},#{category})")
		void addproduct(Product product);
	@Update("update product set price=#{price} where product_id=#{productId}")
		void updateproduct(int ProductId,double price);
	@Delete("delete from product where product_Id=#{productId} ")
		void deleteproduct(int productId);
	@Select("select * from product where product+id=#{productId}")
		Product findById(int productId)throws ProductNotFoundException;
	@Select("select * from product")
		List<Product> findAll();
	@Select("select * from product where brand=#{brand}")
		List<Product> findByBrand(String brand)throws ProductNotFoundException;
	@Select("select * from product where price=#{price}")
		List<Product> findByLessprice(double price)throws ProductNotFoundException;
	@Select("select * fromproduct where category=#{category} and price<#{price}")
		List<Product> findByCategoryandprice(String category, double price)throws ProductNotFoundException;
		
	}


