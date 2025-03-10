package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.nt.modal.Tourist;

@Component
public class RestTemplateClass implements CommandLineRunner 
{

	@Autowired
	private RestTemplate template;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		String endpointURL="http://localhost:8081/BootRestProj10-RestAPI-TouristAPI-MiniProject/tour-API/showone/103";
	
		
		ObjectMapper mapper = new ObjectMapper();
		//mapper.registerModule(new JavaTimeModule());
		//Tourist tour     = mapper.readValue(endpointURL, Tourist.class);
		
		
		//First Way
		ResponseEntity<Tourist>response=template.getForEntity(endpointURL, Tourist.class);
	
		System.out.println("java Object Format :"+response.getBody());
		 
		/*
		 * System.out.println("Status :"+response.getStatusCode());
		 * System.out.println("Header :"+response.getHeaders());
		 * System.out.println("has body :"+response.hasBody());
		 */		
		
		
		////Second way
		//String response = template.getForObject(endpointURL, String.class);
		//System.out.println(response);
		
		
		
		
		//Converting Json to java object(deserilization)
		//System.out.println("Tourist :"+tour);
		
		
		
		
	}
	
}
