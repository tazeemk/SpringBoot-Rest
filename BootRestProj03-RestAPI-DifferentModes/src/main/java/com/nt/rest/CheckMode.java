package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mode-api")
public class CheckMode 
{

	@GetMapping("/getMsg")
	public ResponseEntity<String>getModes(){
		
		return new ResponseEntity<String>("Return Get Resposne",HttpStatus.OK);
	}
	
	@PostMapping("/postMsg")
	public ResponseEntity<String>postModes(){
		return new ResponseEntity<String>("Getting post Response",HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteMsg")
      public ResponseEntity<String>deleteModes(){
    	  return new ResponseEntity<String>("Deleting Record ",HttpStatus.OK);
      }
 
	@PatchMapping("/patchMsg")
    public ResponseEntity<String>patchModes(){
  	  return new ResponseEntity<String>("All Updating Record(PatchMode) ",HttpStatus.OK);
    }
	
	@PutMapping("/putMsg")
    public ResponseEntity<String>putModes(){
  	  return new ResponseEntity<String>("Updating Specific Record(putMode)",HttpStatus.OK);
    }
}
