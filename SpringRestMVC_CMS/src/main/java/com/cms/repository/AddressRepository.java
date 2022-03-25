package com.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>
{

}
