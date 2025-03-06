package com.telusko.ThirdWedApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	@GetMapping("test")
	public String get(Model map)
	{
		return "home";
	}
	
	@GetMapping("response")
	public String get2(Model map)
	{
		map.addAttribute("${msg}", "hello welcome to 2025th year");
		String []str= new String[]{"java","python","c++"};
		map.addAttribute("books", str);
		
		return "response";
	}

}
