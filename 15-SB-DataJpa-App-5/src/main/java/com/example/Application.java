package com.example;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.entity.CustomerEntity;
import com.example.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CustomerRepository repository = context.getBean(CustomerRepository.class);
		
		CustomerEntity entity = new CustomerEntity();
		
		/*entity.setCustomerId(123);
		entity.setCustomerName("Rahul");
		entity.setCustomerEmail("gunapatirahul1@gmail.com");
		
		entity.setCustomerId(45);
		entity.setCustomerName("Rohit");
		entity.setCustomerEmail("rohitsharma45@gmail.com");
		
		entity.setCustomerId(77);
		entity.setCustomerName("Gill");
		entity.setCustomerEmail("shubmangill77@gmail.com");*/
		
		//repository.save(entity);
		
		entity.setCustomerName("Rahul");
		Example<CustomerEntity> example = Example.of(entity);
		List<CustomerEntity> list = repository.findAll(example);
		list.forEach(each->{
			System.out.println(each);
		});
		
		
		/*int pageSize = 1;
		int pageNo=1; //will com from UI
		
		
		Page<CustomerEntity> page = repository.findAll(PageRequest.of(pageNo,pageSize)); //findAll() is a overloaded method is JpaRepository
		List<CustomerEntity> list = page.getContent();
		System.out.println(list);*/
		
		context.close();
	}

}
