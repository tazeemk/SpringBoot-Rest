package com.nt.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class PostRunnr implements CommandLineRunner 
{
	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception 
	{
	        
		String url="http://localhost:8081/BootRestProj10-RestAPI-TouristAPI-MiniProject/tour-API/save";
	   	
		String json_body="{\"tname\":\"sakib\",\"taddr\":\"LA\",\"mobileno\":\"9009090909\",\"dob\":\"1990-11-21\" }";
		
		HttpHeaders header = new HttpHeaders();
	       header.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String>data =new HttpEntity<String>(json_body, header);
	
	     ResponseEntity<String>entity=template.postForEntity(url, data, String.class);
	   System.out.println(entity.getBody());
	     System.exit(0);
	}
	
	
}
