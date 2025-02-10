package com.learning.springCoreCourses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.springCoreCourses.services.Courses;

@SpringBootApplication
public class SpringCoreCoursesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringCoreCoursesApplication.class, args);
		Courses obj=run.getBean(Courses.class);
		obj.get(113.4);
	}

}
