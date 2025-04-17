package com.learning.demoREST1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class TestController {

	
	@GetMapping("greet")
	//@ResponseBody
	public ResponseEntity get()
	{
		String wish ="hello all";
		return new ResponseEntity<>(wish, HttpStatus.OK);
	}
}
