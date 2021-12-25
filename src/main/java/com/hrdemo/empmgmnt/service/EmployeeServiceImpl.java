package com.hrdemo.empmgmnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrdemo.empmgmnt.entity.Employee;
import com.hrdemo.empmgmnt.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired 
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Employee createEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) this.employeeRepository.findAll();
	}
}
