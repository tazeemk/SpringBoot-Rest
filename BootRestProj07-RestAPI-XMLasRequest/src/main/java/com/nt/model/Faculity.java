package com.nt.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculity 
{

   
	private Integer fid;
   	
	private String fname;
   	
   	private String fcourse;
   
   	private String fpackage;
	
	private LocalDate dob;
}
