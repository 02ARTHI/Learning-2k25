package com.learning.springCoreCourses.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Courses {
	
	@Autowired
	private Telusko st;
	
	private Double amount;
	
	
	
	public Telusko getSt() {
		return st;
	}

	public void setSt(Telusko st) {
		this.st = st;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Courses()
	{
		System.out.println("courses bean got created");
	
	}
	
	public void get(Double amount)
	{
		System.out.println("courses purchased");
		st.buy(amount);
	}
	

}
