package com.example.JdbcTransaction.service;

import com.example.JdbcTransaction.model.Employee;
import com.example.JdbcTransaction.model.EmployeeHealthInsurance;
import com.example.JdbcTransaction.service.impl.InvalidInsuranceAmountException;

// TODO: Auto-generated Javadoc
/**
 * The Interface OrganizationService.
 */
public interface OrganizationService {
	
	/**
	 * Join organization.
	 *
	 * @param employee the employee
	 * @param employeeHealthInsurance the employee health insurance
	 */
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance)throws InvalidInsuranceAmountException;

	/**
	 * Leave organization.
	 *
	 * @param employee the employee
	 * @param employeeHealthInsurance the employee health insurance
	 */
	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);


}
