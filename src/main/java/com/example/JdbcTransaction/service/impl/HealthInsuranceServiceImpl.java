package com.example.JdbcTransaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.JdbcTransaction.dao.HealthInsuranceDao;
import com.example.JdbcTransaction.model.EmployeeHealthInsurance;
import com.example.JdbcTransaction.service.HealthInsuranceService;

// TODO: Auto-generated Javadoc
/**
 * The Class HealthInsuranceServiceImpl.
 */
@Service
@Transactional
public class HealthInsuranceServiceImpl implements HealthInsuranceService {

	/** The health insurance dao. */
	@Autowired
	HealthInsuranceDao healthInsuranceDao;

	/**
	 * Register employee health insurance.
	 *
	 * @param employeeHealthInsurance the employee health insurance
	 */
	@Override
	public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance)
	throws InvalidInsuranceAmountException {
		
	if (employeeHealthInsurance.getCoverageAmount() < 0) {
		throw new InvalidInsuranceAmountException("Coverage Amount Should not be negative");
		}
	healthInsuranceDao.registerEmployeeHealthInsurance(employeeHealthInsurance);
	}

	/**
	 * Delete employee health insurance by id.
	 *
	 * @param empid the empid
	 */
	@Override
	public void deleteEmployeeHealthInsuranceById(String empid) {
		healthInsuranceDao.deleteEmployeeHealthInsuranceById(empid);
	}

}
