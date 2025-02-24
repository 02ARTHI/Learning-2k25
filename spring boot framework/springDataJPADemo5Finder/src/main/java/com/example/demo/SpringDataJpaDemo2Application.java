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
		Company com= new Company(2,"ibm",5000,25);
		System.out.println(bean.findByJpa(com, true, "name"));
		
		//jpa method
		System.out.println(bean.searchById(2));
		
		//search by object
		System.out.println(bean.searchByIdObject(com));
		
		System.out.println("deleting records by batch");
		List<Integer> ids=new ArrayList<Integer>();
		ids.add(2);
		ids.add(4);
		ids.add(6);
		
		System.out.println(bean.removeIdBYBatch(ids));
	}

}
