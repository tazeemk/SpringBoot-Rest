package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nt.model.TaxService;

@Component
public class PostMethodTaxService implements CommandLineRunner {
    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {
        String url = "http://localhost:8083/BootRestProj18-RESTAPI-TaxServices/tax-api/save";

        // ✅ Fixed JSON Format
        String json_body = "{\"participant_id\":\"P12345\", \"name\": \"John Doe\", \"amount\": 1500.75, \"date\": \"2025-02-22\"}";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> jsonBody = new HttpEntity<>(json_body, headers);

        ResponseEntity<TaxService> response = template.exchange(url, HttpMethod.POST, jsonBody, TaxService.class);
        System.out.println(response.getBody());

        System.exit(0);
    }
}
