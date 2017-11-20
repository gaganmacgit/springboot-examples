package com.example.springexample.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springexample.model.Model7;

/**
 * Conditional that only matches when the application context is a web
 * application context.
 * 
 * @author gagan
 *
 */
@Configuration
public class ConditionalOnWebApplicationConfiguration {

	@Bean
	@ConditionalOnNotWebApplication
	//@ConditionalOnWebApplication
	public Model7 model7() {
		return new Model7();
	}
}
