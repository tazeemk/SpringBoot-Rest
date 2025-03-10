package com.nt.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaxService 
{

	  private Integer id;
	  private String participant_id;
	  private String name;  
	  private Double amount;
	  private LocalDate date;
	
}
