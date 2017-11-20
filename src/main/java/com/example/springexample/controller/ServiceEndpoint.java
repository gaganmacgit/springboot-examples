package com.example.springexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springexample.properties.MicroservicesClientProperties;

@RestController
public class ServiceEndpoint {

	// Below are properties defined in application.properties

	@Value("${application.name}")
	private String applicationName;

	@Value("${username}")
	private String userName;

	@Autowired
	private MicroservicesClientProperties clientProperties;

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String listEndpointProperties() {

		StringBuilder builder = new StringBuilder();
		builder.append("Application name : ").append(applicationName).append("\r\n").append("User name : ")
				.append(userName).append("\r\n").append("MiscroServiceClientProperties: ")
				.append(clientProperties.toString());

		return builder.toString();
	}
}
