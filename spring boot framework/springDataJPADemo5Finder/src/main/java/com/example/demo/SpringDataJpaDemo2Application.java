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
		
		bean.fetchByName("cts").forEach(v->System.out.println("name :" +v));
		
		bean.fetchByNameIs("cts").forEach(v->System.out.println("name is:" +v));
		
		bean.fetchByNameEquals("cts").forEach(v->System.out.println("name equals:" +v));
		
		bean.fetchByStrength(1000).forEach(v->System.out.println("strength :" +v));
		
		bean.fetchByYearsOld(25).forEach(v->System.out.println("yrs old :" +v));
		
		bean.fetchByYearsOldLessThan(30).forEach(v->System.out.println("yrs old less than 6k:" +v));
		
		bean.fetchByYearsOldBetween(20, 40).forEach(v->System.out.println("yrs old between :" +v));
		
		List<Integer> nums=new ArrayList<>();
		nums.add(1000);
		nums.add(25);
		nums.add(3);
		bean.fetchByYearsOldInAndStrengthBetween(nums, 25, 3000).forEach(v->System.out.println("yrs old between :" +v));
	}

}
