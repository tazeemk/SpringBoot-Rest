package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.TaxServices;
import com.nt.service.TaxServiceImplService;

@RestController
@RequestMapping("tax-api")
public class TaxServiceRestAPI 
{
    @Autowired
	private TaxServiceImplService service;
     @PostMapping("save")
    public ResponseEntity<String>saveParticipant(@RequestBody TaxServices tax){
    	String result =service.saveDetail(tax);
    	return new ResponseEntity<String>(result,HttpStatus.OK);
    }
     @GetMapping("get/{id}")
     public ResponseEntity<TaxServices>getTaxDetails(@PathVariable Integer id){
    	 TaxServices result = service.showTaxById(id);
      return new ResponseEntity<TaxServices>(result,HttpStatus.OK);
     }
}
