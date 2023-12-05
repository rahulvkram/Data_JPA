package com.example;

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
		
		CustomerEntity entity = new CustomerEntity();
		
		entity.setCustomerId(123);
		entity.setCustomerName("Rahul");
		entity.setCustomerEmail("gunapatirahul0204@gmail.com");
		
		repository.save(entity);
		/*Whenever we call save(), it executes SELECT query and will checks if there's any record 
		 * present with the same PK. If yes, it check if the data trying to insert matches.If it doesn't 
		 * match, then update the query. If it doesn't find any record with same PK, then it inserts
		 * the new record.*/
		
		context.close();
	}

}
