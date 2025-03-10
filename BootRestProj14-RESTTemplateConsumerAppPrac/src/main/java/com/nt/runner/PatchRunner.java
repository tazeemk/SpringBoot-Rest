package com.nt.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class PatchRunner implements CommandLineRunner {

	
	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
		
		String endpointsURL="http://localhost:8081/BootRestProj10-RestAPI-TouristAPI-MiniProject/tour-API/addr/{id}/{add}";
		
		HttpHeaders header= new HttpHeaders();
	          header.setContentType(MediaType.APPLICATION_JSON);
	       HttpEntity entity = new HttpEntity(header);
	       
	       template.put(endpointsURL, entity, 105,"hyderabad");
	
	      System.out.println("updated Successfully :");
	      System.exit(0);
	}

}
