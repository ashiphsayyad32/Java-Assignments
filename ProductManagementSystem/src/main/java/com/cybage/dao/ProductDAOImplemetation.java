package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cybage.model.Product;

import JDBCUtility.JDBCUtility;

public class ProductDAOImplemetation implements ProductDAO
{
//	Scanner sc = new Scanner(System.in);
	
	Connection conn = JDBCUtility.getConnection();
	PreparedStatement ps;
	ResultSet rs;
	
	
	
	public Product getProductById(int id) {
		Product product=null;
		try {
			ps = conn.prepareStatement("select * from product where id = ?");
			ps.setInt(1, id);
			rs= ps.executeQuery();
			rs.next();
			String name = rs.getString(2);
			double price = rs.getDouble(3);
			product = new Product(id, name, price);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
	

	public void addProduct(Product product) {
		int result;
		try {
			ps = conn.prepareStatement("insert into product(name,price) values (?,?)");
			
			ps.setString(1, product.getName());
			ps.setDouble(2, product.getPrice());
			result = ps.executeUpdate();
			
			if(result>0) {
				System.out.println(result+" Product Added!!!");
			}
			else {
				System.out.println("Product Failed to Add in Database");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<Product>();
		try {
			
			ps = conn.prepareStatement("select * from product");
			rs = ps.executeQuery();
		
			while(rs.next()) {
//				System.out.println(rs.getString(2)+" "+rs.getDouble(3));
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				list.add(product);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	public void deleteProduct(int id) {
		int result;
		try {
			ps = conn.prepareStatement("delete from product where id=?");
			ps.setInt(1, id);
			result=ps.executeUpdate();
			if(result>0) {
				System.out.println("Product Deleted");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
}
