package com.example.springexample.components;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springexample.dao.CustomJDBCTemplateRepository;
import com.example.springexample.model.Employee;

@Component
public class CustomCommandLineRunner implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(CustomCommandLineRunner.class);

	@Value("${application.name}")
	private String applicationName;

	@Value("${username}")
	private String userName;

	@Autowired
	private CustomJDBCTemplateRepository repository;

	@Override
	public void run(String... arg0) throws Exception {

		logger.info("Value of Application name {} and username is {}", applicationName, userName);

		logger.info("about to add a  employee ");
//		repository.addEmployee();

		logger.info("\n\n\n ######## Fetching employees from table ###########");
		List<Employee> findAllEmployees = repository.findAllEmployees();
		findAllEmployees.forEach(System.out::println);
	}

}
