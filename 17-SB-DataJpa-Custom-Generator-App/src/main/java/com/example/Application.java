 package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Order;
import com.example.repository.OrderDtlsRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		OrderDtlsRepository repo = ctxt.getBean(OrderDtlsRepository.class);
		Order entity = new Order();
		entity.setCustomerName("Baki");
		Order order = repo.save(entity);
		System.out.println(order);	
		
		
	}

}
 