package com.nt.advice;

import lombok.Data;

@Data
public class ErrorMsg 
{

	private String url;
	private String msg;
	private String mode;
	private String status;
}
