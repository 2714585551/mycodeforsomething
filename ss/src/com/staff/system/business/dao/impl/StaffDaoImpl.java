/**
 * 
 */
package com.staff.system.business.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.staff.system.business.dao.Dao;
import com.staff.system.business.dao.StaffDao;
import com.staff.system.business.entity.Depart;
import com.staff.system.business.entity.Device;
import com.staff.system.business.entity.Staff;
import com.staff.system.business.entity.StaffSort;
import com.staff.system.core.dao.impl.BaseDaoImpl;
import com.staff.system.core.vo.PageData;
import com.staff.system.core.vo.QueryPage;



@Repository
public class StaffDaoImpl extends BaseDaoImpl<Staff, Long> implements StaffDao {

	@Override
	public List<Staff> getStaffList(long companyid,String isadmin) {
		List<Staff> list =  new ArrayList<Staff>();
 	     Connection conn = Dao.getConnection();
	     String sql="select * from t_sys_staff where STAFF_COMPANYID=? and STAFF_ISADMIN=?"; 
	       try {  
	             PreparedStatement p=conn.prepareStatement(sql);
	             p.setLong(1, companyid);
	             p.setString(2, isadmin);
	             ResultSet rs = p.executeQuery();
	             while(rs.next())
	             {
	            	 Staff staff = new Staff(); 
	            	 staff.setId(rs.getInt(1));
	            	 staff.setStaffName(rs.getString(2));
	            	 staff.setStaffGender(rs.getString(3));
	            	 staff.setStaffPhone(rs.getString(4));
	            	 staff.setStaffPicture(rs.getString(5));
	            	 staff.setStaffCardID(rs.getString(6));
	            	 staff.setStaffAddress(rs.getString(7));
	            	 staff.setStaffBirthday(rs.getString(10));
	            	 staff.setStaffRemark(rs.getString(11));
	            	 staff.setStaffEmail(rs.getString(12));
	            	 staff.setStaffDep(rs.getString(14));
	            	 list.add(staff);
	             }
	              return list; 
	       } catch (SQLException e) {  
            e.printStackTrace();  
         }catch (Exception e) {
    	   e.printStackTrace();
    	 }
 	   return null;
	}

	@Override
	public Staff getStaffByID(int id) {
		String hql = "from  Staff  t where t.id=:id" ;
		Map<String,Object> paramMap = new HashMap<>();
		paramMap.put("id", id);
		return super.getUniqueByHQL(hql, paramMap);
	}

	@Override
	public Staff saveStaff(Staff staff) {
		if(staff.getStaffPassword() == null || staff.getStaffPassword() == "")
		{
			staff.setStaffPassword("123456");
			super.save(staff);
		}else{
			super.save(staff);
		}
		return staff;
	}

	@Override
	public List<Staff> getStaffByName(String name) {
		String hql = "from  Staff  t where t.staffName=:staffName" ;
		Map<String,Object> paramMap = new HashMap<>();
		paramMap.put("staffName", name);
		List<Staff> listByHQL = super.getListByHQL(hql, paramMap );
		return listByHQL;
	}

	@Override
	public boolean updatastaff(Staff staff) {
		 Connection conn = Dao.getConnection();
	     String sql="update t_sys_staff set STAFF_NAME=?,STAFF_GENDER=?,STAFF_PHONE=?,STAFF_PICTURE=?,STAFF_CARDID=?,STAFF_ADDRESS=?,STAFF_BIRTHDAY=?,STAFF_REMARK=?,STAFF_EMAIL=?,STAFF_ISADMIN=?,STAFF_PASSWORD=?where ID=?";  
	     try {  
	             PreparedStatement preStmt=conn.prepareStatement(sql);  
	             preStmt.setString(1,staff.getStaffName());   
	             preStmt.setString(2,staff.getStaffGender());  
	             preStmt.setString(3,staff.getStaffPhone()); 
	             preStmt.setString(4,staff.getStaffPicture()); 
	             preStmt.setString(5,staff.getStaffCardID()); 
	             preStmt.setString(6,staff.getStaffAddress()); 
	             preStmt.setString(7,staff.getStaffBirthday()); 
	             preStmt.setString(8,staff.getStaffRemark());
	             preStmt.setString(9,staff.getStaffEmail());
	             preStmt.setString(10,staff.getIsAdmin());
	             preStmt.setString(11,staff.getStaffPassword());
	             preStmt.setInt(12,staff.getId()); 
	             preStmt.executeUpdate();
	            
	                  return true;
	            } catch (SQLException e) {  
	                e.printStackTrace();  
	             }catch (Exception e) {
	        	   e.printStackTrace();
	        	 }
		 return false;
}

	
}
