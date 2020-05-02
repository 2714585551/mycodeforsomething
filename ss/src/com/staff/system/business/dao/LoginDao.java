package com.staff.system.business.dao;

import com.staff.system.business.entity.Staff;

/** 
* @author 作者 : wangf 
* @version 创建时间：2017年3月27日 下午3:27:02 
* 类说明 
*/
public interface LoginDao {

	public Staff getstaff(String name,String password);
}
 