package com.example.LibraryManagementSystemAssociation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagementSystemAssociation.model.User;
import com.example.LibraryManagementSystemAssociation.repo.IUserRepo;

@Service
public class UserService {
	
	@Autowired
	private IUserRepo repo;
	
	public List<User> getAllUsers()
	{
		return repo.findAll();
	}
	
	public User save(User user)
	{
		return repo.save(user);
	}

}
