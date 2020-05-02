package com.staff.system.business.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.system.business.dao.LoginDao;
import com.staff.system.business.entity.Staff;
import com.staff.system.business.service.Loginservice;


/** 
* @author 作者 : wangf 
* @version 创建时间：2017年3月27日 下午4:11:41 
* 类说明 
*/
@Service
public class Loginserviceimpl implements Loginservice{

	@Autowired
	private LoginDao loginDao;

	@Override
	public Staff getStaff(String account, String password) {
		Staff staff = loginDao.getstaff(account, password);
		return staff;
	}
	
	


}
 