package com.example.LibraryManagementSystemAssociation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagementSystemAssociation.model.User;
import com.example.LibraryManagementSystemAssociation.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/get")
	public List<User> getall()
	{
		return service.getAllUsers();
	}
	
	@PostMapping("/save")
	public User save(@RequestBody User user)
	{
		return service.save(user);
	}
	
	
	
	
}
