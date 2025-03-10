package com.nt.service;

import java.util.List;

import com.nt.entity.Tourist;

public interface IToursitServiceMgmt 
{

	public String addTourist(Tourist tour);
	
	public String addBanchRecord(List<Tourist>tour);
	
	public List<Tourist>showAllTourist();
	
	public Tourist showById(int idVal);
	
	public String modifyTravel(Tourist tour);
	
	public String updateTravellerAddress(int id,String addr);
	
	public List<Tourist>getEmpByAge(int minage);


	public String removeById(int id);
	
}
