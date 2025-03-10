package com.nt.exception;

import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class CustomeException 
{      
    @ExceptionHandler(SQLException.class)
	public ResponseEntity<ErrorMessage> handleSQLException(SQLException se,HttpServletRequest req) 
    {
     System.out.println("CustomeException.handleSQLException()");
       ErrorMessage detail = new ErrorMessage();
         detail.setMessage(se.getMessage());
         detail.setDate(LocalDate.now());
         detail.setPath(req.getRequestURI());
         detail.setStatus("503");
	     return new ResponseEntity<ErrorMessage>(detail,HttpStatus.BAD_REQUEST);	
	}
	
    @ExceptionHandler(exception = Exception.class)
    public ResponseEntity<ErrorMessage>allExceptionHandler(Exception e,HttpServletRequest req){
    	  ErrorMessage detail = new ErrorMessage();
          detail.setMessage(e.getMessage());
          detail.setDate(LocalDate.now());
          detail.setPath(req.getRequestURI());
          detail.setStatus("503");
 	     return new ResponseEntity<ErrorMessage>(detail,HttpStatus.INTERNAL_SERVER_ERROR);	
    	
    	
    }
}
