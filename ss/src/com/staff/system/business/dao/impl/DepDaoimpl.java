package com.staff.system.business.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.staff.system.business.dao.DepDao;
import com.staff.system.business.entity.Depart;
import com.staff.system.business.entity.Staff;
import com.staff.system.core.dao.impl.BaseDaoImpl;

@Repository
public class DepDaoimpl extends BaseDaoImpl<Depart,Long> implements DepDao{


	@Override
	public List<Depart> getalldep(long companyid) {
		String hql = "from  Depart  t where t.companyId= :companyId" ;
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("companyId",companyid );
		List<Depart> listByHQL = super.getListByHQL(hql, paramMap );
		return listByHQL;
	}

	@Override
	public List<Depart> getAllDepbyname(String name) {
		String hql = "from  Depart  t where t.depName= :depName" ;
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("depName",name );
		List<Depart> listByHQL = super.getListByHQL(hql, paramMap );
		return listByHQL;
	}

	@Override
	public boolean savedep(Depart dep) {
		super.save(dep);
		return true;
	}




}
