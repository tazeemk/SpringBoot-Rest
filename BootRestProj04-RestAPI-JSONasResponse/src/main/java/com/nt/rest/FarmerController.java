package com.nt.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Farmer;
import com.nt.model.Land;

@RestController
@RequestMapping("farmer-api")
public class FarmerController 
{

	@GetMapping("/data")
	public ResponseEntity<Farmer>showData(){
		Land land = new Land(929, 2000, "New York City");
		
		Farmer f = new Farmer("101", "Devang", "Los Vegas",909332,
				List.of(2334,22333),Set.of("Badhshah"), Map.of("name","aadu", "devang", "gaadu"), land);
		
		return new ResponseEntity<Farmer>(f,HttpStatus.OK);
	}
	
}
