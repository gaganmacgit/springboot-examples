package com.example.springexample.dao;

import java.util.Arrays;
import java.util.List;

public class MongoDBUserDAOImpl implements UserDAO {

	@Override
	public List<String> getAllUsers() {
		System.out.println(" MongoDBUserDAOImpl = > getAllUsers  method ");
		return Arrays.asList("Mongo1", "Mongo2");
	}

}
