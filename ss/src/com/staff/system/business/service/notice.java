package com.staff.system.business.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.staff.system.business.dao.Dao;


public class notice {
	
	public static boolean noticesave(String noticetext,Long compnyid)
	{
		 Connection conn = Dao.getConnection();
	     String sql="insert into t_sys_notice(noticetext,companyid) values (?,?)";
	     try {  
	             PreparedStatement preStmt=conn.prepareStatement(sql); 
	             preStmt.setString(1,noticetext);  
	             preStmt.setLong(2,compnyid);   
	             preStmt.executeUpdate(); 
	                  return true;
	            } catch (SQLException e) {  
	                e.printStackTrace();  
	             }catch (Exception e) {
	        	   e.printStackTrace();
	        	 }
		return true;
	}
	public static String getnoticetext()
	{
		String notice = "";
		Connection conn = Dao.getConnection();
	    String sql="select * from t_sys_notice  where noticeid=(select MAX(noticeid) from t_sys_notice )";
	    try {  
            PreparedStatement preStmt=conn.prepareStatement(sql);  
            ResultSet rs=preStmt.executeQuery(); 
            while(rs.next())
            {
             notice = rs.getString("noticetext"); 
            }
            Dao.close(rs, preStmt, conn);
            return notice;
           } catch (SQLException e) {  
               e.printStackTrace();  
            }catch (Exception e) {
       	   e.printStackTrace();
       	 }
		return "";
	}
	
	public static int getnoticenum()
	{
		int number = 0;
		Connection conn = Dao.getConnection();
	    String sql="select * from t_sys_notice";
	    try {  
            PreparedStatement preStmt=conn.prepareStatement(sql);  
            ResultSet rs=preStmt.executeQuery(); 
            while(rs.next())
            {
               number++;
            }
            Dao.close(rs, preStmt, conn);
            return number;
           } catch (SQLException e) {  
               e.printStackTrace();  
            }catch (Exception e) {
       	   e.printStackTrace();
       	 }
		return number;
	}
	
}
