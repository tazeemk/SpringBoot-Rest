package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

 


@SpringBootApplication
public class BootRestProj15RestTemplateConsumerAppExchangeApplication {

	@Bean(name = "template")
	public RestTemplate createTemplate() {
		
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootRestProj15RestTemplateConsumerAppExchangeApplication.class, args);
	}

}
