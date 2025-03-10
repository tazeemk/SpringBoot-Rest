package com.nt.advice;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ErrorDeatils 
{

	private String message;
	private LocalDate date;
	private String status;
	private String path;
	
}
