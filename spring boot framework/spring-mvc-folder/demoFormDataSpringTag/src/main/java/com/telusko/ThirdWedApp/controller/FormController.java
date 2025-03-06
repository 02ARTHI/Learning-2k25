package com.telusko.ThirdWedApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

	@GetMapping("register")
	public String get(@ModelAttribute("emp") Employee emp)
	{
		return "register";
	}
	
	@PostMapping("register")
	public String msg(Model map, @ModelAttribute("emp") Employee emp)
	{
		System.out.println(emp);
		map.addAttribute("emp", emp);
		return "home";
	}
}
