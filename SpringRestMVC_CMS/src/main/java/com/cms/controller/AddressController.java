package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.model.Address;

import com.cms.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressservice;
	
	@PostMapping("/addAddress")
	public ResponseEntity<String> addAddress(@RequestBody Address address){
		addressservice.addAddress(address);
		return new ResponseEntity<String>("Customer Added!!!",HttpStatus.OK);
	}
	
	@GetMapping("/getAllAddress")
	public ResponseEntity<List<Address>> getAllAddress(){
		List<Address>addresslist= addressservice.getAllAddress();
		return new ResponseEntity<List<Address>>(addresslist,HttpStatus.OK);
	}
	
}
