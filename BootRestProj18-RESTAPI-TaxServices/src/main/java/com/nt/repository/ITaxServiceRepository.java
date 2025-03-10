package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.TaxServices;

public interface ITaxServiceRepository extends JpaRepository<TaxServices, Integer> 
{
      // public TaxServices findByparticipant_id(String id);
}
