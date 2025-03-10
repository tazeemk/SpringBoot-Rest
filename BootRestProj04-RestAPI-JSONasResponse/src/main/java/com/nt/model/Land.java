package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Land 
{

	private Integer landNo;
	
	private Integer Area;
	
	private String Location;
}
