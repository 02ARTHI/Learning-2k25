package com.learning.springcoreDemo.web;

import org.springframework.stereotype.Component;

@Component
public class Student {

	
	private int id;
	private String name;
	
	public Student()
	{
		System.out.println("student bean has been created");
	}
	
	
	
	public String data()
	{
		return"spring boot first application";
	}
}
