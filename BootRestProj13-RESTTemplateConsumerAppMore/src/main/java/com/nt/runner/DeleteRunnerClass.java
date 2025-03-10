package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DeleteRunnerClass implements CommandLineRunner 
{

	@Autowired
   private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
	
		String endpointURL="http://localhost:8081/BootRestProj10-RestAPI-TouristAPI-MiniProject/tour-API/delete/{id}";
	 template.delete(endpointURL,109);
	  
	  System.err.println("Tourist Deleted :");
	System.exit(0);
	}
	
}
