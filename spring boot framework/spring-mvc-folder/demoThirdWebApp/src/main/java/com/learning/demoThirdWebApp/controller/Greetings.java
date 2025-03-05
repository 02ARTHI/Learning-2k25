package com.learning.demoThirdWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learning.demoThirdWebApp.service.IGreetingService;

@Controller
public class Greetings {

	@Autowired
	private IGreetingService repo;
	
	@GetMapping("greet")
	public String getmsg(Model map)
	{
		
		map.addAttribute("msg",repo.get());
		return "greeting";
	}
	
	@GetMapping("greeting2")
	public void getmsg2(Model map)
	{
		
		map.addAttribute("msg",repo.get());
		//return "greeting";
	}

}

