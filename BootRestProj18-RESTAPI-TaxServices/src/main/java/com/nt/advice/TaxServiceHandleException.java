package com.nt.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class TaxServiceHandleException {

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ErrorMsg>handleRuntimeException(HttpServletRequest req,RuntimeException re){
		ErrorMsg msg= new ErrorMsg();
		msg.setMode(req.getMethod());
	    msg.setMsg(re.getMessage());
	    msg.setUrl(req.getRequestURI());
	 return new ResponseEntity<ErrorMsg>(msg,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMsg>handleException(HttpServletRequest req,RuntimeException re){
		ErrorMsg msg= new ErrorMsg();
		msg.setMode(req.getMethod());
	    msg.setMsg(re.getMessage());
	    msg.setUrl(req.getRequestURI());
	 return new ResponseEntity<ErrorMsg>(msg,HttpStatus.BAD_REQUEST);
	}
}
