package com.example.springexample.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springexample.model.Model1;
import com.example.springexample.model.Model2;
import com.example.springexample.model.Model3;

/**
 * Conditional that only matches when the given Bean name or classes are already
 * present in the BeanFactory. The annotation when placed on a @Bean then the
 * bean class is default to the return type of the bean definition.
 * 
 * @author gagan
 *
 */
@Configuration
public class ConditionalOnBeanConfig {

	@Bean
	public Model1 getModel1BeanInstance() {
		return new Model1();

	}

	@Bean
	@ConditionalOnBean
	public Model2 getModel2BeanInstance() {
		return new Model2();

	}

	@Bean
	@ConditionalOnBean(name = "getModel1BeanInstance")
	public Model3 getModel3BeanInstance() {
		return new Model3();

	}
}
