package com.nt.service;

import com.nt.entity.TaxServices;

public interface ITaxServiceImplRepo 
{

	public String saveDetail(TaxServices tax);
    public TaxServices showTaxById(Integer id);
}
