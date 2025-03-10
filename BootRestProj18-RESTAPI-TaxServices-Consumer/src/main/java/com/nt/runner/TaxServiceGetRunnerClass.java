package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nt.model.TaxService;
//@Component
public class TaxServiceGetRunnerClass implements CommandLineRunner {
	@Autowired
	private RestTemplate template;
	@Override
	public void run(String... args) throws Exception 
	{
	 String url="http://localhost:8083/BootRestProj18-RESTAPI-TaxServices/tax-api/get/1";	
           ResponseEntity<TaxService> tax = template.exchange(url, HttpMethod.GET, null, TaxService.class);
	     System.out.println(tax.getBody());
	 System.exit(0);
	}

}
