package com.example.springexample.configuration;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfiguration {

	private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceConfiguration.class);

	@Value("${datasource.name}")
	private String datasourceName;

	@Value("${datasource.url}")
	private String datasourceURL;

	public String getDatasourceName() {
		return datasourceName;
	}

	public void setDatasourceName(String datasourceName) {
		this.datasourceName = datasourceName;
	}

	public String getDatasourceURL() {
		return datasourceURL;
	}

	public void setDatasourceURL(String datasourceURL) {
		this.datasourceURL = datasourceURL;
	}

	@Bean
	public String getSomeDataSourceObject() {
		StringBuilder dataSourceBuilder = new StringBuilder().append(datasourceName).append(" : ")
				.append(datasourceURL);
		return dataSourceBuilder.toString();
	}

	@Profile(value="test")
	@Bean
	public CommandLineRunner runner(ApplicationContext applicationContext) {

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		LOGGER.info(" Number of beans available in app context are {} ", beanDefinitionNames.length);
		Arrays.stream(beanDefinitionNames).sorted().forEach((bean) -> System.out.println(bean));
		return (args) -> {

		};
	}

}
