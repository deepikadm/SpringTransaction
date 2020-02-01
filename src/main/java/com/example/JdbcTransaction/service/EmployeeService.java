package com.example.JdbcTransaction.service;

import com.example.JdbcTransaction.model.Employee;

public interface EmployeeService {
	
	void insertEmployee(Employee emp);

	void deleteEmployeeById(String empid);

}
