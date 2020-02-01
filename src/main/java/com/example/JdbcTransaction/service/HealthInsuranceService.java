package com.example.JdbcTransaction.service;

import com.example.JdbcTransaction.model.EmployeeHealthInsurance;
import com.example.JdbcTransaction.service.impl.InvalidInsuranceAmountException;

// TODO: Auto-generated Javadoc
/**
 * The Interface HealthInsuranceService.
 */
public interface HealthInsuranceService {
	
	/**
	 * Register employee health insurance.
	 *
	 * @param employeeHealthInsurance the employee health insurance
	 */
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance)throws InvalidInsuranceAmountException;

	/**
	 * Delete employee health insurance by id.
	 *
	 * @param empid the empid
	 */
	void deleteEmployeeHealthInsuranceById(String empid);

}
