package com.cybage.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cybage.model.Product;
import com.cybage.service.ProductServiceImplementaion;

public class ProductManagementMain {

	public static void main(String[] args) {
		
		ProductServiceImplementaion pservice = new ProductServiceImplementaion();
		
		Product product=null;
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("\n1.Get Product By ID\n"
					+ "2.Add product to database\n"
					+ "3.Display All Product\n"
					+ "4.Delete Product By Id\n"
					+ "5.Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Id to get product: ");
				int id = sc.nextInt();
				product = pservice.getProductById(id);
				System.out.println(product.toString());
				break;
				
			case 2:
				System.out.println("Enter Product Name to Add : ");
				String name = sc.next();
				System.out.println("Enter Product Price to Add : ");
				double price = sc.nextDouble();
				
				product = new Product(name, price);
				pservice.addProduct(product);
				break;
				
			case 3:
				List<Product> productList = pservice.getAllProduct();
				for(Product p : productList) {
					System.out.println(p);
				}
//				System.out.println(productList+"\n");
				break;
				
			case 4:
				System.out.println("Enter Product Id to delete: ");
				int pid = sc.nextInt();
				pservice.deleteProduct(pid);
//				System.out.println("product Deleted from Database!!!");
				break;
				
			case 5:
				System.out.println("Terminated.....");
				flag=false;
				break;
			}
			
			
			
		}
		
	
	}

}
