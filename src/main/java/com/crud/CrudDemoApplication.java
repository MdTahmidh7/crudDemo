package com.crud;

import com.crud.entity.Student;
import com.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudDemoApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		Student student1 = new Student("Saju","Islam","saju@gmail.com");
		studentRepository.save(student1);
		Student student2 = new Student("Raju","Islam","raju@gmail.com");
		studentRepository.save(student2);
		Student student3 = new Student("Joy","Khan","joy@gmail.com");
		studentRepository.save(student3);
	}
}
