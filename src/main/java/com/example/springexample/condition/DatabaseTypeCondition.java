package com.example.springexample.condition;

import java.util.Map;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.example.springexample.annotation.DatabaseType;

public class DatabaseTypeCondition implements Condition {
	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
		Map<String, Object> attributes = metadata.getAnnotationAttributes(DatabaseType.class.getName());
		String type = (String) attributes.get("value");
		String enabledDBType = System.getProperty("DbType", "Mongo");
		return (enabledDBType != null && type != null && enabledDBType.equalsIgnoreCase(type));
	}
}