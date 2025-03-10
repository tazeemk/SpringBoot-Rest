package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository
public class EmployeeImpl implements IEmployeeDAO {

	private String INSERT="INSERT INTO tblemp(empName,empLoc,sal) VALUES (?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	int k=0;
	
	@Override
	public String insertEmployee(Employee emp)throws Exception
	{
		try(Connection con = ds.getConnection();
			PreparedStatement ps =con.prepareStatement(INSERT);){		
			try {
				ps.setString(1, emp.getEmpName());
				ps.setString(2, emp.getEmpLoc());
				ps.setDouble(3, emp.getSal());
				k = ps.executeUpdate();
			}catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}catch (Exception e) {
			 e.printStackTrace();
				throw e;
			}
		}
		return "Employee Is Added Successfully :"+k;	
	}

}
