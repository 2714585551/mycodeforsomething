package com.staff.system.business.dao;

import java.util.List;

import com.staff.system.business.entity.Depart;

public interface DepDao {
 
	public List<Depart> getalldep(long companyid);
	
	public List<Depart> getAllDepbyname(String name);
	
	public boolean savedep(Depart dep);
}
