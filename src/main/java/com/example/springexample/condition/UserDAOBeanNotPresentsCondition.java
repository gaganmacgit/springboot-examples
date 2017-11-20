package com.example.springexample.condition;

import java.util.Map;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.example.springexample.dao.UserDAO;

public class UserDAOBeanNotPresentsCondition implements Condition {
	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
		Map<String, UserDAO> beansOfType = conditionContext.getBeanFactory().getBeansOfType(UserDAO.class);
		return beansOfType.isEmpty();
	}
}