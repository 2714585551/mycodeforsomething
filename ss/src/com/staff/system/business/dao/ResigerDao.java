package com.staff.system.business.dao;

import com.staff.system.business.entity.Company;

public interface ResigerDao {
	
	public Company saveCompany(Company company);
	
	public Company findpk(long pk);
	
	public Company updatacom(Company com);

}
