package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Tourist;
import com.nt.repository.ITouristRepository;

@Service
public class TouristServiceImpl implements IToursitServiceMgmt {
    
	@Autowired
	private ITouristRepository tourRepo;
	
	
	@Override
	public String addTourist(Tourist tour) {
	      int idVal =tourRepo.save(tour).getTid();	
		return "Tourist is Saved with id "+idVal;
	}
	
	@Override
	public String addBanchRecord(List<Tourist> tour) {
	
		int idval =tourRepo.saveAll(tour).size();
		return idval+"No of Tourist are added :";
	}
	
	
	@Override
	public List<Tourist> showAllTourist() {
	
		return tourRepo.findAll().stream().sorted((t1,t2)->t1.getTname().compareTo(t2.getTname())).toList();
	}

	
	@Override
	public Tourist showById(int idVal) {
	
		Optional<Tourist>op=tourRepo.findById(idVal);
		if(op.isPresent()) {
			return op.get();
		}else 
		{
			
		throw new IllegalArgumentException("Id Not Found");
	}
	}
	
	
	@Override
	public String modifyTravel(Tourist tour) {
	Optional< Tourist>op = tourRepo.findById(tour.getTid());
	if(op.isPresent()) {
		tourRepo.save(tour);
		return tour.getTid()+" : is updated";	
		}
	else {
		return tour.getTid() +" : is Not Found";	
	}
	}
	
	
	@Override
	public String updateTravellerAddress(int id, String addr) {

     Optional<Tourist>op = tourRepo.findById(id);
     if(op.isPresent()) {
    	 Tourist tour =op.get();
    	 tour.setTaddr(addr);
    	 tourRepo.save(tour);
    	 return tour.getTid()+"Successfully Updated the Address :";
     }else {
		return "Id not Founded :";
	}
	}
	
@Override
	public List<Tourist> getEmpByAge(int minage) {
	
	
	    return tourRepo.getEmpByAge(minage);
	}
}
