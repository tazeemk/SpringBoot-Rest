package com.nt.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Faculity;

@RestController
@RequestMapping("faculty-api")
public class FaculityRestController 
{
       @PostMapping("report1")
	public ResponseEntity<String>setDetails(@RequestBody Faculity faculity){
		
		return new ResponseEntity<String>(faculity.toString(),HttpStatus.OK);
	}

       @PostMapping("report2")
        public ResponseEntity<String>getMore(List<Faculity> f)
     {
    	
    	   return new ResponseEntity<String>(f.toString(),HttpStatus.OK);
       }
       
}
