package com.example.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Serializable>{

}
