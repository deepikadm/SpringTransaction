package com.example.JdbcTransaction.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.example.JdbcTransaction.model.Employee;
import com.example.JdbcTransaction.model.EmployeeHealthInsurance;
import com.example.JdbcTransaction.service.EmployeeService;
import com.example.JdbcTransaction.service.HealthInsuranceService;
import com.example.JdbcTransaction.service.OrganizationService;

// TODO: Auto-generated Javadoc
/**
 * The Class OrganzationServiceImpl.
 */
@Service
@Transactional
public class OrganzationServiceImpl implements OrganizationService {

	/** The employee service. */
	@Autowired
	EmployeeService employeeService;

	/** The health insurance service. */
	@Autowired
	HealthInsuranceService healthInsuranceService;

	@Override
	// Using Transactional annotation we can define any isolation level supported by the underlying database.
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) throws InvalidInsuranceAmountException {
		employeeService.insertEmployee(employee);
		healthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);
	}


	@Override
	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
		employeeService.deleteEmployeeById(employee.getEmpId());
		healthInsuranceService.deleteEmployeeHealthInsuranceById(employeeHealthInsurance.getEmpId());
	}
	}