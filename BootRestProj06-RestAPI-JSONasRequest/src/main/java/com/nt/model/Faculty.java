package com.nt.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Faculty 
{

	private Integer fid;
	
	private String fname;
	
	private String fsub;
	
	private String fpackage;
	
	private LocalDateTime dob;
	
}
