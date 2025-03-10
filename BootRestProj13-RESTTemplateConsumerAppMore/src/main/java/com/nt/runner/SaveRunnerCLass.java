package com.nt.runner;

import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class SaveRunnerCLass implements CommandLineRunner {

	
	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
	
		String endpointURL="http://localhost:8081/BootRestProj10-RestAPI-TouristAPI-MiniProject/tour-API/save";
		
		String json_body="{\"tname\":\"Alex\",\"taddr\":\"LA\",\"mobileno\":\"909099999\",\"dob\":\"1990-01-21\"}";
		
		org.springframework.http.HttpHeaders header  = new org.springframework.http.HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		
		
		HttpEntity<String>entity = new HttpEntity<String>(json_body,header);
		
		ResponseEntity<String>res = template.postForEntity(endpointURL, entity, String.class);
		
		System.out.println("Body :"+res.getBody());
		
		System.exit(0);
	}

}
