package com.example.springexample.dao;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springexample.model.Employee;

@Repository
public class CustomJDBCTemplateRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomJDBCTemplateRepository.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Employee> findAllEmployees() {

		List<Employee> empList = jdbcTemplate.query("select empno,ename,mgr,sal,deptno from emp",
				(ResultSet resultset, int arg1) -> {
					return new Employee(resultset.getString("empno"), resultset.getString("ename"),
							resultset.getString("mgr"), resultset.getString("sal"), resultset.getString("deptNo"));
				});
		return empList;
	}

	public void addEmployee() {

		try {
			String insertStatement = "insert into emp (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (?,?,?,?,?,?,?,?)";
			jdbcTemplate.update(insertStatement, 8000, "Gagan", "Architect", 7698, new Date(), 35000, null, 10);
		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
		}

	}

}
