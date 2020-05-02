package com.staff.system.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.system.business.dao.PowerDao;
import com.staff.system.business.entity.Power;
import com.staff.system.business.service.PowerSevice;

@Service
public class PowerSeviceImpl implements  PowerSevice{

	@Autowired
	private PowerDao powerdao;
	@Override
	public boolean savepower(Power power) {
		return powerdao.savepower(power);
	}
	@Override
	public Power getpower(int staffid) {
		return powerdao.getpower(staffid);
	}

}
