package com.staff.system.business.dao;

import java.util.List;

import com.staff.system.business.entity.Staff;



public interface StaffDao {

	public List<Staff> getStaffList(long comid,String isadmin);
	
	public Staff getStaffByID(int id);
	
	public List<Staff> getStaffByName(String name);
	
	public Staff saveStaff(Staff staff);

	public  boolean updatastaff(Staff staff);
}
