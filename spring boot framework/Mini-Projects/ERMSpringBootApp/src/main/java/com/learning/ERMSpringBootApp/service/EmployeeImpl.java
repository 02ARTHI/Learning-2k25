package com.learning.ERMSpringBootApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.ERMSpringBootApp.dao.IEmployeeRepo;
import com.learning.ERMSpringBootApp.model.Employee;

@Service
public class EmployeeImpl implements IEmployeeService{

	@Autowired
	private IEmployeeRepo repo;
	
	@Override
	public List<Employee> getAllEmployeeList() {
		// TODO Auto-generated method stub
		return (List<Employee>) repo.findAll();
	}

}
