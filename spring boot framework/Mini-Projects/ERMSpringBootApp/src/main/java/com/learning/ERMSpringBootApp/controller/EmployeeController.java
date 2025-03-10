package com.learning.ERMSpringBootApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.ERMSpringBootApp.model.Employee;
import com.learning.ERMSpringBootApp.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	@GetMapping("/emlist")
	public String getallEmployee(Model Map)
	{
		List<Employee> list = service.getAllEmployeeList();
		Map.addAttribute("list", list);
		System.out.println(list);
		return "home";
	}
	
	@GetMapping("showForm")
	public String form( Model map)
	{
		Employee emp = new Employee();
		map.addAttribute("employee", emp);
		return "form";
	}
	
	@PostMapping("/registerCustomer")
	public String saveData(@ModelAttribute("employee") Employee employee)
	{
		service.saveEmp(employee);
		return "redirect:/emlist";
	}
	
	@GetMapping("/updateForm")
	public String updateData(@RequestParam("customerId") int id,Model map)
	{
		Employee emp = service.getEmp(id);
		map.addAttribute("emp", emp);
		return "update";
	}
	
	@GetMapping("deleteData")
	public String deleteEmp(@RequestParam("customerId") int id)
	{
		service.deleteEmp(id);
		return "redirect:/emlist";
	}
	
}
