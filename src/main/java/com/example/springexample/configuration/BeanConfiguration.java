package com.example.springexample.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.example.springexample.annotation.DatabaseType;
import com.example.springexample.condition.MongoDBUserDAOInstanceCondition;
import com.example.springexample.condition.Neo4jDBUserDAOInstanceCondition;
import com.example.springexample.condition.UserDAOBeanNotPresentsCondition;
import com.example.springexample.dao.MongoDBUserDAOImpl;
import com.example.springexample.dao.Neo4JDBUserDAOImpl;
import com.example.springexample.dao.UserDAO;

@Configuration
public class BeanConfiguration {

	
	@Bean
	@DatabaseType("Mongo")
//	@Conditional(MongoDBUserDAOInstanceCondition.class)
//	@Conditional(UserDAOBeanNotPresentsCondition.class)
	public UserDAO getMongoDBInstance() {
		System.out.println("######## Inside getMongoDBInstance for bean configuration ######");
		return new MongoDBUserDAOImpl();
	}
	
	@Bean
//	@Conditional(Neo4jDBUserDAOInstanceCondition.class)
	@DatabaseType("Neo4j")
	public UserDAO getNeo4jDBInstance() {
		System.out.println("####### Inside getNeo4jDBInstance for bean configuration #######");
		return new Neo4JDBUserDAOImpl();
	}
	


	

}
