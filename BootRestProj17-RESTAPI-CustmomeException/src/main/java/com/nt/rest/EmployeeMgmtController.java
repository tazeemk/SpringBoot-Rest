package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@RestController
@RequestMapping("emp-api")
public class EmployeeMgmtController {
    @Autowired
	private IEmployeeService serive;
	
    @PostMapping("add")
    public ResponseEntity<String>setEmp(@RequestBody Employee emp) throws Exception
    {
    	String result=serive.addEmployee(emp);
    	return new ResponseEntity<String>(result,HttpStatus.OK);
    }
}
