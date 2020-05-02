package com.staff.system.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.system.business.dao.StaffSortDao;
import com.staff.system.business.entity.StaffSort;
import com.staff.system.business.service.StaffSortSevice;

@Service
public class SatffSortSeviceImpl implements StaffSortSevice{

	
	@Autowired
	private StaffSortDao sortdao;
	@Override
	public boolean savesort(StaffSort sort) {
		
		return sortdao.savesort(sort);
	}
	
	

}
