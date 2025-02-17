package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.IStudentrepo;
import com.example.demo.dao.Student;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaDemoApplication.class, args);
		IStudentrepo bean = run.getBean(IStudentrepo.class);
		Student st= new Student(1,"80","pappu");
		bean.save(st);
	}

}
