package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.model.Address;
import com.cms.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressrepo;

	public void addAddress(Address address) {
		
		addressrepo.save(address);
		
	}

	public List<Address> getAllAddress() {
		return addressrepo.findAll();
	}
	
	
}
