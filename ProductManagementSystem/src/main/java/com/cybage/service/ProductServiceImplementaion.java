package com.cybage.service;

import java.util.List;

import com.cybage.dao.ProductDAOImplemetation;
import com.cybage.model.Product;

public class ProductServiceImplementaion implements ProductService
{

	ProductDAOImplemetation productDao = new ProductDAOImplemetation();
	
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.getProductById(id);
	}

	public void addProduct(Product addProduct) {
		// TODO Auto-generated method stub
		productDao.addProduct(addProduct);
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.getAllProduct();
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(id);
	}

}
