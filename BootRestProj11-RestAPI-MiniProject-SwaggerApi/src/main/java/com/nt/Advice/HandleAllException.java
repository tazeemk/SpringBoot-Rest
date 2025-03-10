package com.nt.Advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleAllException {

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String>handleRuntime(){
		return new ResponseEntity<String>("Runtime Exception Occur",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String>handleAllRuntime(){
		return new ResponseEntity<String>("ALL Exception Occur",HttpStatus.BAD_REQUEST);
	}
}
