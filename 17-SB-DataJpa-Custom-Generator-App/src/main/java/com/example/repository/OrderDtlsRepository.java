package com.example.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Order;

public interface OrderDtlsRepository extends JpaRepository<Order, Serializable>{

}
