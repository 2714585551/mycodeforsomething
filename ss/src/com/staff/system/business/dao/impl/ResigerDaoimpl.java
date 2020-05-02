package com.staff.system.business.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.staff.system.business.dao.ResigerDao;
import com.staff.system.business.entity.Company;
import com.staff.system.business.entity.Staff;
import com.staff.system.core.dao.impl.BaseDaoImpl;


@Repository
public class ResigerDaoimpl extends BaseDaoImpl<Company, Long> implements ResigerDao {

	@Override
	public Company saveCompany(Company company) {
		
		super.save(company);
		return company;
	}

	@Override
	public Company findpk(long pk) {
		
		return super.get(pk);
	}

	@Override
	public Company updatacom(Company com) {
       super.saveOrUpdate(com);
		return com;
	}

}
