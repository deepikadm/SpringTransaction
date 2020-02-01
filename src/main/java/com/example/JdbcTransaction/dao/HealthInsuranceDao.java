package com.example.JdbcTransaction.dao;

import com.example.JdbcTransaction.model.EmployeeHealthInsurance;

// TODO: Auto-generated Javadoc
/**
 * The Interface HealthInsuranceDao.
 */
public interface HealthInsuranceDao {
	
	/**
	 * Register employee health insurance.
	 *
	 * @param employeeHealthInsurance the employee health insurance
	 */
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	/**
	 * Delete employee health insurance by id.
	 *
	 * @param empid the empid
	 */
	void deleteEmployeeHealthInsuranceById(String empid);

}
