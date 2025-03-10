package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.advice.IdNotFound;
import com.nt.entity.TaxServices;
import com.nt.repository.ITaxServiceRepository;
@Service
public class TaxServiceImplService implements ITaxServiceImplRepo {
     @Autowired
	private ITaxServiceRepository taxRepo;
	
	@Override
	public String saveDetail(TaxServices tax) {
		int id =taxRepo.save(tax).getId();
		return "Participant is Saved with Id :"+id;
	}

	@Override
	public TaxServices showTaxById(Integer id) {
    Optional<TaxServices> tax  = taxRepo.findById(id);
	if	(tax.isPresent()) {
    return tax.get();
	}
	
	throw new IllegalArgumentException("Id Not Foung");	
}
}
