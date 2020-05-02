package com.staff.system.business.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Repository;

import com.staff.system.business.dao.LoginDao;
import com.staff.system.business.entity.Staff;
import com.staff.system.core.dao.impl.BaseDaoImpl;

/** 
* @author 作者 : wangf 
* @version 创建时间：2017年3月27日 下午4:11:48
* 类说明 
*/

@Repository
public class LoginDaoimpl extends BaseDaoImpl<Staff, Long>  implements LoginDao {

	@Override
	public Staff getstaff(String name, String password) {
		String sql = "from Staff where ID =:name and staffPassword =:password";
		Map<String,Object> paramMap = new HashMap<>();
		paramMap.put("name", name);
		paramMap.put("password", password);
		return super.getUniqueByHQL(sql,paramMap);
	}
	
}


 