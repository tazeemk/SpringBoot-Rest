package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootRestProj13RestTemplateConsumerAppMoreApplication {

	
	@Bean(name = "template")
	public RestTemplate createTemplate() {
		
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootRestProj13RestTemplateConsumerAppMoreApplication.class, args);
	}

}
