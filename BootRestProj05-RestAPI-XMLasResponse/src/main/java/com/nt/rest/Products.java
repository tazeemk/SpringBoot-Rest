package com.nt.rest;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Faculty;
import com.nt.model.Product;
import com.nt.model.Seller;

@RestController
@RequestMapping("product-api")
public class Products 
{
	
	@GetMapping("report1")
	public ResponseEntity<Product>setdetail(){
		
		Seller s = new Seller(1101, "Devang Traders", "New York", "Los Angeles");
		Product p = new Product(100, Set.of("Ak47","M4"), "DevangWeapons", List.of(90909,100000), s);
		return new ResponseEntity<Product>(p,HttpStatus.OK);
	}
	
	@GetMapping("report2")
	public ResponseEntity<List<Faculty>>setFaculty(){
		Faculty f = new Faculty(101, "devang", "Java", "11cr");
		Faculty f1 = new Faculty(102, "sahid", ".net", "10cr");
		Faculty f2 = new Faculty(103, "sahil", "python", "19cr");
	     
		return new ResponseEntity<List<Faculty>>(List.of(f,f1,f2),HttpStatus.OK);
	}

}
