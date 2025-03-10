package com.learning.ERMSpringBootApp.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public void saveEmp(Employee emp) {
		repo.save(emp);
		
	}

	@Override
	public Employee getEmp(int id) {
		Optional<Employee> byId = repo.findById(id);
		return byId.get();
	}

	@Override
	public void deleteEmp(int id) {
		repo.deleteById(id);
		
	}

	

}
