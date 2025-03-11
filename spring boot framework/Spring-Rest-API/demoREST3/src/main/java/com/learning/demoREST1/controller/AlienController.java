package com.learning.demoREST1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demoREST1.model.Alien;

@RestController
public class AlienController {
	
	@GetMapping("get")
	public ResponseEntity<Alien> get()
	{
		Alien c= new Alien();
		c.setId(1);
		c.setCity("cbe");
		c.setName("arthi");
		return new ResponseEntity<Alien>(c,HttpStatus.OK);
	}
	
	@PostMapping("save")
	public ResponseEntity<String> save(@RequestBody Alien alien )
	{
		System.out.println(alien);
		String msg="added to db";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
