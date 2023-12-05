package com.example.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Serializable>{
//public CustomerEntity findByCustomerEmail(String email);
//	public CustomerEntity findByCustomerName(String name);
//public CustomerEntity findByCustomerNameAndCustomerEmail(String name,String email);
	
	@Query(value="select customerName from CustomerEntity")
	public List<String> findAllNames();
}
