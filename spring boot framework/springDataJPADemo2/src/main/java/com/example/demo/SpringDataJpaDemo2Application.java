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
		
		// add one obj
		/*Company obj=new Company(1,"cts",1000,25);
		bean.register(obj); */
		
		//add mul obj's
		/*Company obj2=new Company(2,"ibm",5000,25);
		Company obj3=new Company(3,"bosch",6000,20);
		Company obj4=new Company(4,"tcs",8000,35);
		
		List<Company> comls= new ArrayList<Company>();
		comls.add(obj4);
		comls.add(obj3);
		comls.add(obj2);
		bean.getAllList(comls).forEach(v->System.out.println(v));*/
		
		System.out.println(bean.count());
		System.out.println(bean.existsCom(3));
		bean.getall().forEach(v->System.out.println(v));
		List<Integer> ids= new ArrayList<Integer>();
		ids.add(2);
		ids.add(4);
		
		bean.getallByID(ids).forEach(v->System.out.println(v));
		
		System.out.println("find company by id");
		Optional<Company> opt = bean.getCompanyBYId(2);
		if(opt.isEmpty())
		{
			System.out.println("id is not present");
			opt.orElseThrow(()-> new IllegalArgumentException("Record not found"));
		}
		else
		{
			System.out.println("id is present");
		}
		
		//delete by id
		System.out.println(bean.removeById(3));
		
		//deleted by IDS
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(6);
		System.out.println(bean.removeCompanyBYIds(a));
			
		//delete by company object
		Company com= new Company(4,"wipro",4500,25);
		System.out.println(bean.removeBYObject(com));
	}

}
