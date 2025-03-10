package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nt.modal.Tourist;
//@Component
public class TouristRunner implements CommandLineRunner {

	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception 
	{

		String endpointsURL ="http://localhost:8081/BootRestProj10-RestAPI-TouristAPI-MiniProject/tour-API/show";
		Class<? extends List>clazz=new ArrayList<Tourist>().getClass();
		
		ResponseEntity<? extends List>get =template.getForEntity(endpointsURL, clazz);
		
		System.out.println("Body :"+get.getBody());

		System.exit(0);
	}

}
