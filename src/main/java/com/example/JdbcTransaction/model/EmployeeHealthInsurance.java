package com.example.JdbcTransaction.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeHealthInsurance.
 */
@Entity
@Table(name="HealthInsurance")
public class EmployeeHealthInsurance {
    
    /** The emp id. */
    @Id
    @Column(name="empId")
	private String empId;
    
    /** The health insurance scheme name. */
    @Column(name="healthInsuranceSchemeName")
	private String healthInsuranceSchemeName;
	
    /** The coverage amount. */
    @Column(name="coverageAmount")
	private int coverageAmount;

	/**
	 * Gets the emp id.
	 *
	 * @return the emp id
	 */
	public String getEmpId() {
		return empId;
	}

	/**
	 * Sets the emp id.
	 *
	 * @param empId the new emp id
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	/**
	 * Gets the health insurance scheme name.
	 *
	 * @return the health insurance scheme name
	 */
	public String getHealthInsuranceSchemeName() {
		return healthInsuranceSchemeName;
	}

	/**
	 * Sets the health insurance scheme name.
	 *
	 * @param healthInsuranceSchemeName the new health insurance scheme name
	 */
	public void setHealthInsuranceSchemeName(String healthInsuranceSchemeName) {
		this.healthInsuranceSchemeName = healthInsuranceSchemeName;
	}

	/**
	 * Gets the coverage amount.
	 *
	 * @return the coverage amount
	 */
	public int getCoverageAmount() {
		return coverageAmount;
	}

	/**
	 * Sets the coverage amount.
	 *
	 * @param coverageAmount the new coverage amount
	 */
	public void setCoverageAmount(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	
	
}
