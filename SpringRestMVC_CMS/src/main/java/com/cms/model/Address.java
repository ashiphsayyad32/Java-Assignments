package com.cms.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address_customer")
public class Address {

	@Id
	@GeneratedValue
	private int address_id;
	private String state;
	private String pincode;
	
	@ManyToOne
	private Customer customer;
	
	public Address() {}

	public Address(int address_id, String state, String pincode) {
		super();
		this.address_id = address_id;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", state=" + state + ", pincode=" + pincode + "]";
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
