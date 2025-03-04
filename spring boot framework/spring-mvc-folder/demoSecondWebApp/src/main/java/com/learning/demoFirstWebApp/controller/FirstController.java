package com.learning.demoFirstWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@GetMapping("welcome")
	public ModelAndView get()
	{
		ModelAndView mac = new ModelAndView();
		mac.addObject("msg","welcome to first web page");
		mac.setViewName("index");
		return mac;
	}
}
