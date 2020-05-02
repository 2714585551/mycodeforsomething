package com.staff.system.business.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.staff.system.business.dao.PowerDao;
import com.staff.system.business.entity.Power;
import com.staff.system.core.dao.impl.BaseDaoImpl;

@Repository
public class PowerDaoImpl extends BaseDaoImpl<Power, Long>  implements PowerDao{

	@Override
	public boolean savepower(Power power) {
		super.saveOrUpdate(power);
		return true;
	}

	@Override
	public Power getpower(int staffid) {
		String hql = "from  Power  t where t.staffid=:id" ;
		Map<String,Object> paramMap = new HashMap<>();
		paramMap.put("id", staffid);
		return super.getUniqueByHQL(hql, paramMap);
	}

}
