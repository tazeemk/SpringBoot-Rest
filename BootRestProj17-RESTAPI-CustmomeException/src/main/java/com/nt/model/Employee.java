package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
public class Employee 
{

	private Integer empNo;
	private String empName;
	private String empLoc;
	private Double sal;
}
