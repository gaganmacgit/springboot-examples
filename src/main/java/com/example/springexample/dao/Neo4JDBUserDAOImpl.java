package com.example.springexample.dao;

import java.util.Arrays;
import java.util.List;

public class Neo4JDBUserDAOImpl implements UserDAO {

	@Override
	public List<String> getAllUsers() {
		System.out.println(" Neo4JDBUserDAOImpl => getAllUsers method");
		return Arrays.asList("Ne04j1", "Ne04j2");
	}

}
