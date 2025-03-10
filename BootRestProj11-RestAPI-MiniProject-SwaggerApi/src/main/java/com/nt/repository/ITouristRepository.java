package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Tourist;

public interface ITouristRepository extends JpaRepository<Tourist, Integer> 
{
	
	@Query(nativeQuery = true,value = "select * from Tourist where((sysdate()-dob)/365.25)>=:minage")
	public List<Tourist>getEmpByAge(int minage);

}
