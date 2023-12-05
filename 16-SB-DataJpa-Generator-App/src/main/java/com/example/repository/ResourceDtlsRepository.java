package com.example.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Resource;

public interface ResourceDtlsRepository extends JpaRepository<Resource, Serializable>{

}
