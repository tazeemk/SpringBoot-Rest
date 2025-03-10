package com.nt.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Tourist 
{
    @Id
    @SequenceGenerator(name = "tid_gen",sequenceName = "tid",initialValue = 100,allocationSize = 1)
    @GeneratedValue(generator = "tid_gen",strategy = GenerationType.SEQUENCE)
	public Integer tid;
	
	public String tname;
	
	public String taddr;
	
	public Long mobileno;
	
	public LocalDate dob;
}
