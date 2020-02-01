package com.example.JdbcTransaction.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.JdbcTransaction.dao.EmployeeDao;
import com.example.JdbcTransaction.model.Employee;
import com.example.JdbcTransaction.service.EmployeeService;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeServiceImpl.
 */
@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class EmployeeServiceImpl implements EmployeeService {

	/** The employee dao. */
	@Autowired
	EmployeeDao employeeDao;

	/**
	 * Insert employee.
	 *
	 * @param employee the employee
	 */
	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}

	/**
	 * Delete employee by id.
	 *
	 * @param empid the empid
	 */
	@Override
	public void deleteEmployeeById(String empid) {
		employeeDao.deleteEmployeeById(empid);
	}
}
