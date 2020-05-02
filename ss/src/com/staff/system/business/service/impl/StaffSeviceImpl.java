/**
 * 
 */
package com.staff.system.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.system.business.dao.StaffDao;
import com.staff.system.business.entity.Company;
import com.staff.system.business.entity.Staff;
import com.staff.system.business.entity.StaffSort;
import com.staff.system.business.service.StaffSevice;


/**
  * @ClassName: TeacherSeviceImpl
  * @FullClassPath: com.lpp.mq.service.impl.TeacherSeviceImpl
  * @Description: TODO
  * @author: Arno
  * @date: 2017年3月6日 下午5:32:49
  * @version: 1.0
  */

@Service
public  class StaffSeviceImpl implements StaffSevice {

	@Autowired
	private StaffDao staffDao ;
	
	
	@Override
	public List<Staff> getStaffList(long comid,String isadmin) {
		return  staffDao.getStaffList(comid,isadmin);
	}

	@Override
	public Staff getStaffByID(int id) {
		return staffDao.getStaffByID(id);
	}


	@Override
	public Staff saveStaff(Staff staff) {
		
		return staffDao.saveStaff(staff);
	}

	@Override
	public List<Staff> getStaffByName(String name) {
		return staffDao.getStaffByName(name);
	}

	@Override
	public  boolean updatastaff(Staff staff) {
       return staffDao.updatastaff(staff);
	}
}
