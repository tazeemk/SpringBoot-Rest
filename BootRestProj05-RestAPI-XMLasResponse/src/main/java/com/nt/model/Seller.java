package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Seller 
{

	private Integer sid;
	
	private String name;
	
	private String addr;
	
	private String branch;
	
}
