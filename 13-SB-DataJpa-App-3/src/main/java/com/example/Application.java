package com.example;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.CustomerEntity;
import com.example.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CustomerRepository repository = context.getBean(CustomerRepository.class);
		
	//CustomerEntity entity = new CustomerEntity();
//		
//		entity.setCustomerId(123);
//		entity.setCustomerName("Rahul");
//		entity.setCustomerEmail("gunapatirahul1@gmail.com");
//		repository.save(entity);
//	CustomerEntity entity1 = repository.findByCustomerNameAndCustomerEmail("Rahul", "gunapatirahul0204@gmail.com");
//	System.out.println(entity1);
		
		List<String> allNames = repository.findAllNames();
		System.out.println(allNames);
		
		
		context.close();
	}

}
