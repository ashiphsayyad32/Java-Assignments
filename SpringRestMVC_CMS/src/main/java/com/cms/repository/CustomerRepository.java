package com.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

}
