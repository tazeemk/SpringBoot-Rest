package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootRestProj18RestapiTaxServicesConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestProj18RestapiTaxServicesConsumerApplication.class, args);
	}

	@Bean("template")
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}
}
