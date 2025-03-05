package com.learning.demoThirdWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

	@GetMapping("true")
	public String get(Model map)
	{
		Course course = new Course(1,"cts",260);
		map.addAttribute("course",course);
		return "course";
	}
	
	@GetMapping("truee")
	public String get2(Model map)
	{
		
		map.addAttribute("cid",1);
		map.addAttribute("name","arthi");
		map.addAttribute("price",200);
		return "courseinfo";
	}
	
}
