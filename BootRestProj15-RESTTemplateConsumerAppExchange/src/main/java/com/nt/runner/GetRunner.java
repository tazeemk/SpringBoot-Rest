package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class GetRunner implements CommandLineRunner {

	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
		
		String endpointsURL="http://localhost:8081/BootRestProj10-RestAPI-TouristAPI-MiniProject/tour-API/show";
		  
		           ResponseEntity<String>response = template.exchange(endpointsURL, HttpMethod.GET, null, String.class);
		
		           System.out.println("Response Body : "+response.getBody());
		           System.out.println("Headers :"+response.getHeaders());
		           
		           System.exit(0);
	}

}
