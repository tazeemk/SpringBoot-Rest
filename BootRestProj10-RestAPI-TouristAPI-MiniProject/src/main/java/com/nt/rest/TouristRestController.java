package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Tourist;
import com.nt.service.IToursitServiceMgmt;



@RestController
@RequestMapping("tour-API")
public class TouristRestController 
{
   @Autowired
	private IToursitServiceMgmt tourService;
	
   @PostMapping("save")
	public ResponseEntity<String> addTourist(@RequestBody Tourist tour) {
		try {
			
			String msg = tourService.addTourist(tour);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}catch(Exception e) {
			
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
   
   
   @PostMapping("saveall")
   public ResponseEntity<String>addBunchRecord(@RequestBody List<Tourist>tour){
	   try {
		    String msg=tourService.addBanchRecord(tour);
	     return new ResponseEntity<String>(msg,HttpStatus.OK);
	   }catch(Exception e) {
		   
		   return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	   }
   }
   
   
   @GetMapping("show")
   public ResponseEntity<?>getTourist(){
	   try {
		   
		   return new  ResponseEntity<List<Tourist>>(tourService.showAllTourist(),HttpStatus.OK);
	   }catch(Exception e) {
		   return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	   }
   }
   
      @GetMapping("showone/{sno}")
      public ResponseEntity<?>getTourById(@PathVariable("sno")Integer no){
	   try {
		       Tourist tour =tourService.showById(no);
		   return new ResponseEntity<Tourist>(tour,HttpStatus.OK);
	   }catch(Exception e) {
		   return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	   }
	   
   }
      
      @PutMapping("update")
      public ResponseEntity<String>modifyData(@RequestBody Tourist tour){
    	  try {
    		       String msg=tourService.modifyTravel(tour);
    		   return new ResponseEntity<String>(msg,HttpStatus.OK);
    	  }catch(Exception e){
    		  return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    	  }
    	  
      }
   
      
      @PutMapping("addr/{id}/{add}")
      public String updateAddress(@PathVariable int id,@PathVariable String add)
      {
    	 try {
    		  String msg = tourService.updateTravellerAddress(id, add);
    	  return msg;
    	  }catch(Exception e) 
    	  {
    		  
    		return e.getMessage();  
    	  }
    	  
    	  }
	
      
      @GetMapping("tourist/{age}")
      public ResponseEntity<List<Tourist>>empByAge(@PathVariable int age){
    	          List<Tourist>list=tourService.getEmpByAge(age);
    	  return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
      }
      
      //===================================================
      
      @DeleteMapping("delete/{id}")
      public ResponseEntity<String>removeById(@PathVariable int id){
    	   String mgs= tourService.removeById(id);
    	  return new ResponseEntity<String>(mgs,HttpStatus.OK);
      }
      
      
      
      
}
