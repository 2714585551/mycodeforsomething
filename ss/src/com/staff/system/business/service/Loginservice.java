package com.staff.system.business.service;

import com.staff.system.business.entity.Staff;

/** 
* @author 作者 : wangf 
* @version 创建时间：2017年3月27日 下午4:11:07 
* 类说明 
*/
public interface Loginservice {
	public Staff getStaff(String account,String password);
}
 