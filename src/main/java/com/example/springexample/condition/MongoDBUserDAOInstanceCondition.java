package com.example.springexample.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MongoDBUserDAOInstanceCondition implements Condition {

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		String dbType = System.getProperty("DbType");
		return dbType != null && "Mongo".equalsIgnoreCase(dbType);
	}

}
