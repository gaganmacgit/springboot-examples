package com.example.springexample.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springexample.model.Model1;
import com.example.springexample.model.Model6;

/**
 * Conditional that only matches when the specified bean is missing from the
 * beanfactory. This will only match when the bean definition is processed by
 * the application context and as such is recommended to be used by
 * auto-configuration classes only.
 * 
 * @author gagan
 *
 */
@Configuration
public class ConditionalOnMissingBeanConfig {

	
	@Bean
    public Model1 model1(){
        return new Model1(); // will initialize as normal
    }
    
    
    @Bean
	@ConditionalOnMissingBean(name = "model5" )
    public Model6 model6(){
        return new Model6(); // will get initialized as there is no 
                        // bean with name model5 in BeanFactory.
    }
}
