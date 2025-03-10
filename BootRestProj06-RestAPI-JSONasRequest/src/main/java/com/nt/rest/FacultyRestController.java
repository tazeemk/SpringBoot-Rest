package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Faculty;
import com.nt.model.Farmer;

@RestController
@RequestMapping("faculity-api")
public class FacultyRestController 
{
      @PostMapping("report1")
	public ResponseEntity<String> setFaculity(@RequestBody Faculty faculty) {
		
		Faculty f = new Faculty();
		return new ResponseEntity<String>(faculty.toString(),HttpStatus.OK);
	} 
	
      @PostMapping("report2")
      public ResponseEntity<String>getFarmer(@RequestBody Farmer farmer)
      {
    	  
    	  return new ResponseEntity<String>(farmer.toString(),HttpStatus.OK);
      }
}
