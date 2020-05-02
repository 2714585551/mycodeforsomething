package com.staff.system.business.service;

import com.staff.system.business.entity.Company;

public interface Resigerservice {
	
	
	public Company saveCompany(Company company);
	
	public Company findpk(long pk);
	
	public Company updatecom(Company com,long pk);

}
