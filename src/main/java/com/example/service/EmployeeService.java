package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);
	List<Employee> getAllEmployees();
}
