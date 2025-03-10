package com.nt.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Faculty 
{
        @NonNull
	private Integer fid;
        @NonNull
	private String fname;
        @NonNull
	private String fcourse;
        @NonNull
	private String fpackage;
	
	private LocalDate dob;
	
}
