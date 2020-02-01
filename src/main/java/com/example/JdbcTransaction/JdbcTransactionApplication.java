package com.example.JdbcTransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.JdbcTransaction.model.Employee;
import com.example.JdbcTransaction.model.EmployeeHealthInsurance;
import com.example.JdbcTransaction.service.OrganizationService;
import com.example.JdbcTransaction.service.impl.InvalidInsuranceAmountException;

@SpringBootApplication
public class JdbcTransactionApplication {

	public static void main(String[] args) throws InvalidInsuranceAmountException{
		ApplicationContext context = SpringApplication.run(JdbcTransactionApplication.class, args);
		OrganizationService organizationService = context.getBean(OrganizationService.class);

		Employee emp = new Employee();
		emp.setEmpId("emp1");
		emp.setEmpName("emp1");

		EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
		employeeHealthInsurance.setEmpId("emp1");
		employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
		employeeHealthInsurance.setCoverageAmount(20000);

		organizationService.joinOrganization(emp, employeeHealthInsurance);
	}

}
