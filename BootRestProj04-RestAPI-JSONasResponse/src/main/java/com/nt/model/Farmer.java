package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Farmer 
{

	private String fid;
	
	private String fname;
	
	private String faddr;
	
	
	private Integer aadharNo;
	
	private List<Integer>Numbers;
	
	private Set<String>nickNames;
	
	private Map<String,Object>items;
	
	private Land land;
	
	
}
