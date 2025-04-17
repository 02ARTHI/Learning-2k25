package com.learning.demoREST1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demoREST1.model.Alien;

@RestController
public class AlienController {
	
	@GetMapping("get")
	public Alien get()
	{
		Alien c= new Alien();
		c.setId(1);
		c.setCity("cbe");
		c.setName("arthi");
		return c;
	}

}
