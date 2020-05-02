package com.staff.system.business.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.system.business.dao.ResigerDao;
import com.staff.system.business.entity.Company;
import com.staff.system.business.service.Resigerservice;


@Service
public  class ResigerserviceImpl implements Resigerservice {
	
	@Autowired
	private ResigerDao resigerDao;
	
	@Override
	public Company saveCompany(Company company) {
		Company com = resigerDao.saveCompany(company);
		return com;
	}

	@Override
	public Company findpk(long pk) {
		Company com = resigerDao.findpk(pk);
		return com;
	}

	@Override
	public Company updatecom(Company com,long pk) {
		Company updata = resigerDao.findpk(pk);
		updata.setCompanyAddress(com.getCompanyAddress());
		updata.setCompanyDetail(com.getCompanyDetail());
		updata.setCompanyEmile(com.getCompanyEmile());
		updata.setCompanyName(com.getCompanyName());
		updata.setCompanyTelephone(com.getCompanyTelephone());
		updata.setCompanyZip(com.getCompanyZip());
		updata.setCompanyDetail(com.getCompanyDetail());
		Company comp = resigerDao.updatacom(updata);
		return comp;
	}



	
}
