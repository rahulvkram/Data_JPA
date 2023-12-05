 package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Resource;
import com.example.repository.ResourceDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ResourceDtlsRepository repository = context.getBean(ResourceDtlsRepository.class);
		Resource entity = new Resource();
		//entity.setResourceId(100);
		entity.setResourceName("Baki");
		entity.setResourceExp("22 Years");
		entity.setResourceSkill("Combat");
		
		Resource entity1 = new Resource();
		entity1.setResourceName("Yujiro");
		entity1.setResourceExp("54 Years");
		entity1.setResourceSkill("Combat");
		
		Resource resource = repository.save(entity);
		Resource resource1 = repository.save(entity1);
		
		System.out.println("Record inserted with :" +resource.getResourceId());
		System.out.println("Record inserted with :" +resource1.getResourceId());
		
		
	}

}
 