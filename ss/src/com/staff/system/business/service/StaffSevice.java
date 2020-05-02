package com.staff.system.business.service;

import java.util.List;

import com.staff.system.business.entity.Staff;



/**
  * @ClassName: TeacherSevice
  * @FullClassPath: com.lpp.mq.service.TeacherSevice
  * @Description: TODO
  * @author: Arno
  * @date: 2017年3月6日 下午5:32:06
  * @version: 1.0
  */

public interface StaffSevice {

	public List<Staff> getStaffList(long comid,String isadmin);
	
	public Staff getStaffByID(int id);
	
	public List<Staff> getStaffByName(String name);
	
	
	public Staff saveStaff(Staff staff);

	public  boolean updatastaff(Staff staff);
}
