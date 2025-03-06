package com.telusko.ThirdWedApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController {

	@GetMapping("home")
	public String get(@RequestParam("name") String name, Model map, String course)
	{
		String msg="Hello welcome " + name + " to the course "+course;
		map.addAttribute("msg", msg);
		return "home";
	}
}
