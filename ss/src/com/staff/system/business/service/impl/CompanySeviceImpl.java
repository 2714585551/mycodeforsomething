package com.staff.system.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.system.business.dao.CompanyDao;
import com.staff.system.business.entity.Company;
import com.staff.system.business.service.CompanySevice;

@Service
public class CompanySeviceImpl implements CompanySevice{

	@Autowired
	private CompanyDao companyDao;
	@Override
	public Company getCompany(long id) {
		return companyDao.getCompany(id);
	}

}
