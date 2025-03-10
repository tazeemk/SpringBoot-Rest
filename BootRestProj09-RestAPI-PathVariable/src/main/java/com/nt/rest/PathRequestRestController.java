package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("path-api")
public class PathRequestRestController 
{

	/*
	 * @GetMapping("report/{sno}/{name}") public
	 * ResponseEntity<Object>createPath(@PathVariable(value = "sno",required =
	 * false)Integer no,@PathVariable String name){
	 * 
	 * return new ResponseEntity<Object>(no +" ...."+ name ,HttpStatus.OK); }
	 */

          @GetMapping("report/no/name")
            public String test(@PathVariable(value = "no",required = false)Integer sno,@PathVariable(value = "name",required = false)String sname) 
            {
            
            	return "report1";
            }

          @GetMapping(value = { "report1/{no}/{name}","report1/{name}" ,"report1"})
          public ResponseEntity<Object>test1(@PathVariable(value = "no",required = false)Integer sno,@PathVariable(required = false) String name)
        		  {
        	  
        	  return new ResponseEntity<Object>(sno+"..."+name,HttpStatus.OK);
             }

}
