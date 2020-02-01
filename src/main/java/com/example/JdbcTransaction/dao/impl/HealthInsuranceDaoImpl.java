package com.example.JdbcTransaction.dao.impl;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.JdbcTransaction.dao.HealthInsuranceDao;
import com.example.JdbcTransaction.model.EmployeeHealthInsurance;

// TODO: Auto-generated Javadoc
/**
 * The Class HealthInsuranceDaoImpl.
 */

@Repository
public class HealthInsuranceDaoImpl implements HealthInsuranceDao{
	
	/**
	 * Instantiates a new health insurance dao impl.
	 *
	 * @param template the template
	 */
	public HealthInsuranceDaoImpl(NamedParameterJdbcTemplate template) {

		this.template = template;
	}

	/** The template. */
	NamedParameterJdbcTemplate template;

	/**
	 * Register employee health insurance.
	 *
	 * @param empHealthInsurance the emp health insurance
	 */
	@Override
	public void registerEmployeeHealthInsurance(EmployeeHealthInsurance empHealthInsurance) {
		String sql = "INSERT INTO health_insurance "
				+ "(emp_Id, health_insurance_scheme_name, coverage_amount) VALUES (:emp_Id, :health_insurance_scheme_name,:coverage_amount)";
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("emp_Id", empHealthInsurance.getEmpId()).addValue("health_insurance_scheme_name",
				empHealthInsurance.getHealthInsuranceSchemeName()).addValue("coverage_amount", empHealthInsurance.getCoverageAmount());
		template.update(sql,param, holder);
		
	}

	/**
	 * Delete employee health insurance by id.
	 *
	 * @param empid the empid
	 */
	@Override
	public void deleteEmployeeHealthInsuranceById(String empid) {
		String sql = "DELETE FROM health_insurance WHERE emp_Id = :empId";
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("empId", empid);
		template.update(sql,param, holder);
		
	}

}
