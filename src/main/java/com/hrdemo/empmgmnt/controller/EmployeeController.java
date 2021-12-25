package com.hrdemo.empmgmnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrdemo.empmgmnt.entity.Employee;
import com.hrdemo.empmgmnt.service.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
	
	@Autowired 
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@PostMapping(path = "/add")
	public Employee addNewUser(
			@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email,
			@RequestBody String test) {
		System.out.println(test);
		Employee emp = new Employee();
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		return employeeService.createEmployee(emp);
	}

	@GetMapping(path = "/all")
	public List<Employee> getAllUsers() {
		return employeeService.getAllEmployees();
	}
}
