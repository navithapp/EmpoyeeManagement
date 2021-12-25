package com.hrdemo.empmgmnt.repository;

import org.springframework.data.repository.CrudRepository;

import com.hrdemo.empmgmnt.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
