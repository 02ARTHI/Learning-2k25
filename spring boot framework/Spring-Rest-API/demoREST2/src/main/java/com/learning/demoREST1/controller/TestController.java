package com.learning.demoREST1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class TestController {

	
	@GetMapping("greet")
	
	public String get()
	{
		String wish ="hello all";
		return wish;
	}
	
    @GetMapping("greets")
	public String get2(@RequestParam(value="name", required=false,defaultValue="Arthi") String name)
	{
		String wish ="hello all "+name+" welcome to the course";
		return wish;
	}
    
    @GetMapping("greetss/{name}")
	public String get3(@PathVariable(value="name", required=false) String name)
	{
		String wish ="hello all "+name+" welcome to the course";
		return wish;
	}
}
