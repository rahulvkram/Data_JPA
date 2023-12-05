package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.StudentsEntity;
import com.example.repository.StudentsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentsRepository stuRepo = context.getBean(StudentsRepository.class);
		System.out.println(stuRepo.getClass().getName());
		
		StudentsEntity entity = new StudentsEntity();
		entity.setStudentId(223);
		entity.setStudentName("Rahul");
		entity.setStudentEmail("rahulkl@gmail.com");
		
		StudentsEntity entity0 = new StudentsEntity();
		entity0.setStudentId(45);
		entity0.setStudentName("Rohit");
		entity0.setStudentEmail("rohitsharma@gmail.com");
		
		StudentsEntity entity1 = new StudentsEntity();
		entity1.setStudentId(18);
		entity1.setStudentName("Virat");
		entity1.setStudentEmail("viratkohli@gmail.com");
		
		List<StudentsEntity> list = new ArrayList<StudentsEntity>();
		list.add(entity);
		list.add(entity0);
		list.add(entity1);
		
		stuRepo.saveAll(list);
		
		
		
		/*Optional<StudentsEntity> findById = stuRepo.findById(18); //RT is optional object
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}*/
		
		
//		
//		Iterable<StudentsEntity> findAll = stuRepo.findAll();
//		findAll.forEach(entity ->{System.out.println(entity);});
//		
//		
		//stuRepo.deleteById(223);
		context.close();
	}

}