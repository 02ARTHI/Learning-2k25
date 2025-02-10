package com.learning.springCoreCourses.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class springBoot implements Telusko {
	
	public springBoot()
	{
		System.out.println("springboot bean got created");
	}

	@Override
	public String buy(Double amount) {
		System.out.println("bought springboot course");
		return "springboot course";
	}


}
