package com.telusko.ThirdWedApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathController {

	@GetMapping("home/{name}/{course}")
	public String get(@PathVariable("name")String name, Model map,@PathVariable("course")String course)
	{
		String msg="hello all "+name+" welcome to the course "+course;
		map.addAttribute("msg",msg);
		return "home";
	}
	
}
