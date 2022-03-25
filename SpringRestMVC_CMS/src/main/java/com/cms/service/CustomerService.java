package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.model.Address;
import com.cms.model.Customer;
import com.cms.repository.AddressRepository;
import com.cms.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerrepo;
	
	

	public void addCustomer(Customer customer) {
		
		customerrepo.save(customer);
		
	}

	public List<Customer> getAllCustomer() {
		return customerrepo.findAll();
	}

	public Customer getCustomerById(int id) {
		return customerrepo.findById(id).orElse(null);
	}

	public void deleteCustomer(int id) {
		customerrepo.deleteById(id);
		
	}

	public Customer updateCustomer(int id, Customer customer) {
		return customerrepo.save(customer);
		
	}

	
	
	
}
