package com.staff.system.business.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.system.business.dao.DepDao;
import com.staff.system.business.entity.Depart;
import com.staff.system.business.service.DepartService;


@Service
public class DepartServiceimpl  implements DepartService{

	
	@Autowired
	private DepDao depdao;

	@Override
	public List<Depart> getAllDep(long companyid) {
		
		return depdao.getalldep(companyid);
	}

	@Override
	public List<Depart> getAllDepbyname(String name) {
		
		 return depdao.getAllDepbyname(name);
	}

	@Override
	public boolean savedep(Depart dep) {
		return depdao.savedep(dep);
	}
	
	
	
}