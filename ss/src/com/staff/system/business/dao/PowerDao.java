package com.staff.system.business.dao;

import com.staff.system.business.entity.Power;

public interface PowerDao {

	public boolean savepower(Power power);
	public Power getpower(int staffid);
}
