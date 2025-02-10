package com.learning.springcoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.springcoreDemo.web.Student;

@SpringBootApplication
public class SpringcoreDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringcoreDemoApplication.class, args);
		Student bean = container.getBean(Student.class);
		
		System.out.println(bean.data());
		
	}

}
