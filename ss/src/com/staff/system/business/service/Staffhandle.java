package com.staff.system.business.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.staff.system.business.dao.Dao;



public class Staffhandle {
	
	public static int finddepNum(String rs) {
		 Connection conn = Dao.getConnection();
         String sql="select * from t_sys_staff where STAFF_DEPARTMENT = ?"; 
      try {  
             PreparedStatement preStmt=conn.prepareStatement(sql);  
             preStmt.setString(1,rs);
             ResultSet resultset =preStmt.executeQuery();  
             int rowCount = 0; 
             while(resultset.next()) { 
                  rowCount++; 
             }
                  return rowCount;
            } catch (SQLException e) {  
                e.printStackTrace();  
             }catch (Exception e) {
        	   e.printStackTrace();
        	 }
		return 0;
	}
}
