package com.staff.system.business.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.staff.system.business.dao.Dao;
import com.staff.system.business.entity.StaffCheck;



public class StaffCheckHandle {

	
	
	public static List<StaffCheck> showall()
	{
		List<StaffCheck> list =  new ArrayList<StaffCheck>();
 	   Connection conn = Dao.getConnection();
	       String sql="select * from t_sys_staffcheck"; 
	       try {  
	             PreparedStatement p=conn.prepareStatement(sql);
	             ResultSet rs = p.executeQuery();
	             while(rs.next())
	             {
	            	 StaffCheck staffcheck = new StaffCheck();   //需要将不断的staff放在while里，否则的话，会对象重复。
	            	 staffcheck.setStaffid(rs.getInt(1));
	            	 staffcheck.setStaffname(rs.getString(2));
	            	 staffcheck.setStaffarrtime(rs.getString(3));
	            	 staffcheck.setStaffleavetime(rs.getString(4));
	            	 staffcheck.setDevicenumber(rs.getInt(5));
	            	 staffcheck.setStatue(rs.getString(6));
	            	 list.add(staffcheck);
	             }
	             return list; 
	       } catch (SQLException e) {  
            e.printStackTrace();  
         }catch (Exception e) {
    	   e.printStackTrace();
    	 }
		return null;
	}
	
	
	public static List<StaffCheck> showone(String name)
	{
		List<StaffCheck> list =  new ArrayList<StaffCheck>();
 	   Connection conn = Dao.getConnection();
	       String sql="select * from t_sys_staffcheck where staffname=?"; 
	       try {  
	             PreparedStatement p=conn.prepareStatement(sql);
	             p.setString(1, name);
	             ResultSet rs = p.executeQuery();
	             while(rs.next())
	             {
	            	 StaffCheck staffcheck = new StaffCheck();   //需要将不断的staff放在while里，否则的话，会对象重复。
	            	 staffcheck.setStaffid(rs.getInt(1));
	            	 staffcheck.setStaffname(rs.getString(2));
	            	 staffcheck.setStaffarrtime(rs.getString(3));
	            	 staffcheck.setStaffleavetime(rs.getString(4));
	            	 staffcheck.setDevicenumber(rs.getInt(5));
	            	 staffcheck.setStatue(rs.getString(6));
	            	 list.add(staffcheck);
	             }
	             return list; 
	       } catch (SQLException e) {  
            e.printStackTrace();  
         }catch (Exception e) {
    	   e.printStackTrace();
    	 }
		return null;
	}
	
	
	 public static boolean check(StaffCheck staff)
	    {
		     String staffName =staff.getStaffname();
		     String arrtime=staff.getStaffarrtime();
		     String statue = staff.getStatue();	 
 		     int  Devicenumber= staff.getDevicenumber();
 		     long comid = staff.getCompanyid();
		     Connection conn = Dao.getConnection();
		     String sql="insert into t_sys_staffcheck (staffname,staffarrtime,devicenumber,statue,companyid) values (?,?,?,?,?)";  
		     try {  
		             PreparedStatement preStmt=conn.prepareStatement(sql); 
		             preStmt.setString(1,staffName);  
		             preStmt.setString(2,arrtime);  
		             preStmt.setInt(3,Devicenumber);  
		             preStmt.setString(4,statue);  
		             preStmt.setLong(5,comid); 
		             preStmt.executeUpdate();
		                  return true;
		            } catch (SQLException e) {  
		                e.printStackTrace();  
		             }catch (Exception e) {
		        	   e.printStackTrace();
		        	 }
			 return false;
	}
	 
	 public static boolean checkleave(String id,String data)
	    {
		     	 
		     Connection conn = Dao.getConnection();
		     String sql="update t_sys_staffcheck set staffleavetime=? where staffid=?";  
		     try {  
		             PreparedStatement preStmt=conn.prepareStatement(sql);  
		             preStmt.setString(1,data);   
		             preStmt.setString(2,id);  
		             preStmt.executeUpdate();
		            
		                  return true;
		            } catch (SQLException e) {  
		                e.printStackTrace();  
		             }catch (Exception e) {
		        	   e.printStackTrace();
		        	 }
			 return false;
	}
	
	 public static String findcheck(String rs) {
		 Connection conn = Dao.getConnection();
         String sql="select staffid from t_sys_staffcheck where  staffarrtime= ?"; 
      try {  
             PreparedStatement preStmt=conn.prepareStatement(sql);  
             preStmt.setString(1,rs);
             ResultSet resultset =preStmt.executeQuery();
             String id = "";
             while(resultset.next()) { 
            	 id= resultset.getString(1);
             }
                  return id;
            } catch (SQLException e) {  
                e.printStackTrace();  
             }catch (Exception e) {
        	   e.printStackTrace();
        	 }
		return "";
	}
	
}
