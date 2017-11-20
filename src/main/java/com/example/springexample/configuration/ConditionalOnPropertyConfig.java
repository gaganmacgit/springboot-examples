package com.example.springexample.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springexample.model.Model8;

/**
 * Conditional on property checks if the specified property has the specific
 * value. It checks by default if the property is in the Environment and not
 * equals to false.
 * 
 * @author gagan
 *
 */
@Configuration
public class ConditionalOnPropertyConfig {

	@Bean
	@ConditionalOnProperty(name = "username", havingValue = "Gagan")
	public Model8 model8() {
		return new Model8();
	}
}
