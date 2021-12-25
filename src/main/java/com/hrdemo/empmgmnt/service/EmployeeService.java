package com.hrdemo.empmgmnt.service;

import java.util.List;

import com.hrdemo.empmgmnt.entity.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
	
	List<Employee> getAllEmployees();

}
