package com.nt.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.EmployeeImpl;
import com.nt.exception.CustomeException;
import com.nt.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeImpl empRepo;
	
	@Override
	public String addEmployee(Employee emp) throws Exception{
			 String result =empRepo.insertEmployee(emp);
		return result;

	}
}
