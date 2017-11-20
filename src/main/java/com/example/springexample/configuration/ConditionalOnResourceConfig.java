package com.example.springexample.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springexample.model.Model7;

/**
 * Conditional that only matches when the specified resource is available on the
 * classpath.
 * 
 * @author gagan
 *
 */
@Configuration
public class ConditionalOnResourceConfig {

	@Bean
//	@ConditionalOnResource(resources= {"classpath:application.properties"})
	@ConditionalOnResource(resources= {"classpath:applicationnotpresent.properties"})
	public Model7 model7() {
		return new Model7();
	}
}
