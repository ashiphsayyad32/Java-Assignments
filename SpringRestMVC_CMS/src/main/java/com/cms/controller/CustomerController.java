package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.cms.model.Address;
import com.cms.model.Customer;
import com.cms.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice;
	
	@PostMapping("/addCustomer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
		customerservice.addCustomer(customer);
		return new ResponseEntity<String>("Customer Added!!!",HttpStatus.OK);
	}
	
	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		List<Customer>customerlist= customerservice.getAllCustomer();
		return new ResponseEntity<List<Customer>>(customerlist,HttpStatus.OK);
	}
	
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		Customer customer = customerservice.getCustomerById(id);
		return customer;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id){
		customerservice.deleteCustomer(id);
		return new ResponseEntity<String>("Customer Deleted!!",HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable int id,@RequestBody Customer customer){
		customerservice.updateCustomer(id,customer);
		return new ResponseEntity<String>("Customer Updated!!",HttpStatus.OK);
	}
	
	
	
	
	
	
}
