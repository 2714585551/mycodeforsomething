package com.staff.system.business.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.staff.system.business.dao.StaffSortDao;
import com.staff.system.business.entity.StaffSort;
import com.staff.system.core.dao.impl.BaseDaoImpl;

@Repository
public class StaffSortDaoimpl extends BaseDaoImpl<StaffSort,Long> implements StaffSortDao{

	@Override
	public boolean savesort(StaffSort sort) {
		super.saveOrUpdate(sort);
		return true;
	}

	

}
