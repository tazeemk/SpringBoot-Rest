package com.nt.exception;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ErrorMessage 
{

	private String message;
	
	private LocalDate date;
	
	private String path;
	
	private String status;
}
