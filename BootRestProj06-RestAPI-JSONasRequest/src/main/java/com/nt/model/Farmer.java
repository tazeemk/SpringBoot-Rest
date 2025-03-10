package com.nt.model;

import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class Farmer 
{

	private Integer fid;
	
	private String fname;
	
	private Set<String>color;
	
	private List<Long>number;
	
}
