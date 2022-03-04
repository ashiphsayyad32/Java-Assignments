package com.cybage.dao;

import java.util.List;

import com.cybage.model.Product;

public interface ProductDAO {

	//get Product By id
	public Product getProductById(int id);
	
	//add product to db
	public void addProduct(Product addProduct);
	
	//get All product
	public List<Product> getAllProduct();
	
	//delete the product
	public void deleteProduct(int id);
}
