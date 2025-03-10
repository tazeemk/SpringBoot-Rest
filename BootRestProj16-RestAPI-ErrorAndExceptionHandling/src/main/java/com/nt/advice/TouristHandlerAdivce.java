package com.nt.advice;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class TouristHandlerAdivce 
{
      @ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ErrorDeatils>getIllegalArg(IllegalArgumentException ie,HttpServletRequest req){
		
      System.out.println("TouristHandlerAdivce.getIllegalArg()");		
		ErrorDeatils details = new ErrorDeatils();
                 details.setDate(LocalDate.now());
                 details.setMessage(ie.getMessage()); 
	              details.setPath(req.getRequestURI());  
	              details.setStatus("503");
	       return new ResponseEntity<ErrorDeatils>(details,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
      @ExceptionHandler(Exception.class)
      public ResponseEntity<ErrorDeatils>allException(Exception e,HttpServletRequest req){
    	  System.out.println("TouristHandlerAdivce.allException()");
           ErrorDeatils details = new ErrorDeatils();
           details.setDate(LocalDate.now());
           details.setMessage(e.getMessage());
           details.setPath(req.getRequestURI());
           details.setStatus("504");
           
           return new ResponseEntity<ErrorDeatils>(details,HttpStatus.BAD_GATEWAY);
           
      }
      
      
}
