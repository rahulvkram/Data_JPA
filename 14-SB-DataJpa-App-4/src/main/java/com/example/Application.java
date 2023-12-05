package com.example;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.example.entity.CustomerEntity;
import com.example.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CustomerRepository repository = context.getBean(CustomerRepository.class);
		
		CustomerEntity entity = new CustomerEntity();
		
		entity.setCustomerId(123);
		entity.setCustomerName("Rahul");
		entity.setCustomerEmail("gunapatirahul1@gmail.com");
		
		entity.setCustomerId(45);
		entity.setCustomerName("Rohit");
		entity.setCustomerEmail("rohitsharma45@gmail.com");
		
		
		List<CustomerEntity> findAll = repository.findAll(Sort.by("customerId").descending()); //findAll() is a overloaded method is JpaRepository
		System.out.println(findAll);
		
		repository.save(entity);
	
		context.close();
	}

}
