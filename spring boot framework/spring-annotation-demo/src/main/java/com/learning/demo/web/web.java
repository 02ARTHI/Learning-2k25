package com.learning.demo.web;

import org.springframework.stereotype.Component;


public class web {

	public web() {
		System.out.println("from web layer");
		
	}
	
	public String beta()
	{
		//System.out.println("bean created for beta");
		return "bean created for beta";
	}

}
