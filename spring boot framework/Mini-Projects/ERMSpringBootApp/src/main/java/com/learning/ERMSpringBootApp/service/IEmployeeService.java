package com.learning.ERMSpringBootApp.service;

import java.util.List;

import com.learning.ERMSpringBootApp.model.Employee;

public interface IEmployeeService {

	public List<Employee> getAllEmployeeList();
	public void saveEmp(Employee emp);
	public Employee getEmp(int id);
	public void deleteEmp(int id);
}
