package com.example.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import com.example.entity.StudentsEntity;

//@Repository- Used to create beans . But here it's optional because whenever data JPA dependency is available in pom.xml,IoC scans for
//Interfaces extending from CrudRepository and will create Implementation classes for them 
//during run time and creates object/bean for that implementation class*/
public interface StudentsRepository extends CrudRepository<StudentsEntity, Serializable> {
	

}
