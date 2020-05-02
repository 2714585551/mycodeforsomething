package com.staff.system.business.service;

import java.util.List;

import com.staff.system.business.entity.Depart;
import com.staff.system.core.service.BaseService;


public interface DepartService  {
	
   public List<Depart> getAllDep(long companyid);
   
   public List<Depart> getAllDepbyname(String name);
   
   public boolean savedep(Depart dep);
}
