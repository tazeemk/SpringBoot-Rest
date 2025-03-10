package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BootRestProj10RestApiMiniProjectApplication implements WebMvcConfigurer {
     
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
	
		registry.addMapping("/**").allowedOrigins("http://localhost:3000");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootRestProj10RestApiMiniProjectApplication.class, args);
	}

}
