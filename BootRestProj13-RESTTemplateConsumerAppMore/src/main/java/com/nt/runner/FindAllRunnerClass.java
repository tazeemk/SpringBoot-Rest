package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.nt.modal.Tourist;
//@Component
public class FindAllRunnerClass implements CommandLineRunner {

	
	@Autowired
	private RestTemplate template;
	
	
	@Override
	public void run(String... args) throws Exception 
	{
		    String  endpointURL="http://localhost:8081/BootRestProj10-RestAPI-TouristAPI-MiniProject/tour-API/show";
		
		   // Class <? extends List>clazz= new ArrayList<Tourist>().getClass();
		    
	      //  ResponseEntity<? extends List>response  = template.getForEntity(endpointURL,clazz);			
	        
	        ObjectMapper mapper= new ObjectMapper();
	                       mapper.registerModule(new JavaTimeModule());
	        Tourist tour=mapper.readValue(endpointURL, Tourist.class);
	        
	          System.out.println("Tourist :"+tour);
	        
	        //System.out.println("Boyd  :"+response.getBody());
	        
	        System.exit(0);
	}

}
