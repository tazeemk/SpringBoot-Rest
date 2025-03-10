package com.nt.modal;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tourist 
{    
	public Integer tid;
	
	public String tname;
	
	public String taddr;
	
	public Long mobileno;
	
	public LocalDate dob;
}
