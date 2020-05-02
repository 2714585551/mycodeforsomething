package com.staff.system.business.dao.impl;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.staff.system.business.dao.CompanyDao;
import com.staff.system.business.entity.Company;
import com.staff.system.core.dao.impl.BaseDaoImpl;

@Repository
public class CompanyDaoimpl extends BaseDaoImpl<Company, Long>  implements CompanyDao{

	@Override
	public Company getCompany(long id) {
		String sql = "from Company where ID =:id";
		Map<String,Object> paramMap = new HashMap<>();
		paramMap.put("id", id);
		return super.getUniqueByHQL(sql,paramMap);
		
	}

}
