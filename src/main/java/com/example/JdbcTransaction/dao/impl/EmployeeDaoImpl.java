package com.example.JdbcTransaction.dao.impl;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.JdbcTransaction.dao.EmployeeDao;
import com.example.JdbcTransaction.model.Employee;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeDaoImpl.
 */

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	/**
	 * Instantiates a new employee dao impl.
	 *
	 * @param template the template
	 */
	public EmployeeDaoImpl(NamedParameterJdbcTemplate template) {

		this.template = template;
	}

	/** The template. */
	NamedParameterJdbcTemplate template;

	/**
	 * Insert employee.
	 *
	 * @param emp the emp
	 */
	@Override
	public void insertEmployee(Employee emp) {
		String sql = "INSERT INTO employee " + "(emp_id, emp_name) VALUES (:empId, :empName)";
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("empId", emp.getEmpId()).addValue("empName",
				emp.getEmpName());
		template.update(sql,param, holder);
		
		
	}

	/**
	 * Delete employee by id.
	 *
	 * @param empid the empid
	 */
	@Override
	public void deleteEmployeeById(String empid) {
		String sql = "DELETE FROM employee WHERE empId = :empId";
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("empId", empid);
		template.update(sql,param, holder);
		
		
	}



}