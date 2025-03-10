package com.nt.model;

import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product 
{

	private Integer pid;

	private Set pnames;
	
	private String pcompany;
	
	private List pprice;
	
	private Seller seller;
}
