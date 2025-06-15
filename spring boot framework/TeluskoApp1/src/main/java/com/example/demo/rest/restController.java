package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceRest;

@RestController
public class restController {
	
	@Autowired
	private ServiceRest service;
	
	@GetMapping("/get")
	public String getall()
	{
		return service.get();
	}

}
