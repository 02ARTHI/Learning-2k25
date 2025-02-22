package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.CompanyImpl;
import com.example.demo.entity.Company;

@SpringBootApplication
public class SpringDataJpaDemo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaDemo2Application.class, args);
		CompanyImpl bean = run.getBean(CompanyImpl.class);
		
		
	}

}
