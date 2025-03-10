package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("request-api")
@RestController
public class RequestParamRestController 
{
	/*
	 * @GetMapping("report1") public ResponseEntity<String>
	 * createRequest(@RequestParam("sno")int no ,@RequestParam()String name) {
	 * System.out.println(no +"....."+name); return new ResponseEntity<String>(no
	 * +"..."+name,HttpStatus.OK); }
	 */
       
       @GetMapping("report2")
   	public ResponseEntity<String> createRequest2(@RequestParam("sno")int no ,@RequestParam(required = false,defaultValue = "devangBadhshah")String name) 
   	{
   		 System.out.println(no +"....."+name);
   		return new ResponseEntity<String>(no +"..."+name,HttpStatus.OK); 
   	}
	
}
