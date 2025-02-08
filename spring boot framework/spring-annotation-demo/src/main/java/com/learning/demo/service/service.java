package com.learning.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.learning.demo.web.web;

@Component
public class service {
	public service() {
		System.out.println("from service layer");
		
	}

	
//	@Bean
//	public web setup()
//	{
//		web w=new web();
//			
//			System.out.println(w.beta());
//			return w;	
//	}
}
