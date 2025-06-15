package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class controllerclass {
	
	@GetMapping("/info")
	public String getMethodName() {
		
		RestTemplate rs = new RestTemplate();
		ResponseEntity<String> forObject = rs.getForEntity("http://localhost:9090/get", String.class);
		String bodyString=forObject.getBody();
		
		return bodyString+" , Hi from telusko app 2";
	}
	

}
