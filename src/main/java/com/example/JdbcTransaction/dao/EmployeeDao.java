package com.example.JdbcTransaction.dao;

import com.example.JdbcTransaction.model.Employee;

// TODO: Auto-generated Javadoc
/**
 * The Interface EmployeeDao.
 */
public interface EmployeeDao {
	
	/**
	 * Insert employee.
	 *
	 * @param cus the cus
	 */
	void insertEmployee(Employee cus);

	/**
	 * Delete employee by id.
	 *
	 * @param empid the empid
	 */
	void deleteEmployeeById(String empid);

}
