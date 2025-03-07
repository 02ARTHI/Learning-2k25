package com.learning.ERMSpringBootApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.learning.ERMSpringBootApp.model.Employee;
import com.learning.ERMSpringBootApp.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	@GetMapping("emlist")
	public String getallEmployee(Model Map)
	{
		List<Employee> list = service.getAllEmployeeList();
		Map.addAttribute("list", list);
		System.out.println(list);
		return "home";
	}
	
	@GetMapping("showForm")
	public String form(@ModelAttribute("emp") Employee emp, Model map)
	{
		map.addAttribute("employee", map);
		return "form";
	}
	
}
