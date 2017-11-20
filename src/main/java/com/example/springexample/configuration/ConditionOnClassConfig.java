package com.example.springexample.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springexample.model.Model4;
import com.example.springexample.model.Model5;

/**
 * Conditional that only matches when the specified class is available on the
 * classpath. The attributes to the annotation are name and value. Use the name
 * attribute in case if you want to specify the class name and you are not sure
 * whether the classes will be available on the classpath and use value when the
 * classes are available on the classpath.
 * 
 * @author gagan
 *
 */
@Configuration
public class ConditionOnClassConfig {

	@Bean
	@ConditionalOnClass(value = { java.util.HashMap.class })
	public Model4 model4() {
		return new Model4();
	}

	@Bean
	@ConditionalOnClass(name = {"com.sample.Dummy" })
	public Model5 model5() {
		return new Model5();
	}
}
