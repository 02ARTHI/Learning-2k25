package com.learning.springCoreCourses.services;

import org.springframework.stereotype.Service;

@Service
public class Hibernate implements Telusko {

	public Hibernate()
	{
		System.out.println("Hibernate bean got created");
	}
	
	@Override
	public String buy(Double amount) {
		System.out.println("bought hibernate course");
		return "hibernate course";
	}

}
