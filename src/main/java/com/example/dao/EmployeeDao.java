package com.example.dao;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee cus);
	List<Employee> getAllEmployees();
}