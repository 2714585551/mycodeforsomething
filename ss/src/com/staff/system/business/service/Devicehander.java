package com.staff.system.business.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.staff.system.business.dao.Dao;
import com.staff.system.business.entity.Device;


public class Devicehander {

	public static List<Device> deviceall(){
	
		 List<Device> list =  new ArrayList<Device>();
  	     Connection conn = Dao.getConnection();
	     String sql="select * from t_sys_device"; 
	       try {  
	             PreparedStatement p=conn.prepareStatement(sql);
	             ResultSet rs = p.executeQuery();
	             while(rs.next())
	             {
	            	 Device device = new Device();   
	            	 device.setId(rs.getString(1));
	            	 device.setDevicename(rs.getString(2));
	            	 device.setDevicestatue(rs.getString(3));
	            	 device.setDeviceaddress(rs.getString(4));
	            	 list.add(device);
	             }
	            
	             return list; 
	       } catch (SQLException e) {  
             e.printStackTrace();  
          }catch (Exception e) {
     	   e.printStackTrace();
     	 }
  	   return null;
	}
	
	public static List<Device> deviceone(String id){
		
		 List<Device> list =  new ArrayList<Device>();
  	     Connection conn = Dao.getConnection();
	     String sql="select * from t_sys_device where id=?"; 
	       try {  
	             PreparedStatement p=conn.prepareStatement(sql);
	             p.setString(1, id);
	             ResultSet rs = p.executeQuery();
	             while(rs.next())
	             {
	            	 Device device = new Device();   
	            	 device.setId(rs.getString(1));
	            	 device.setDevicename(rs.getString(2));
	            	 device.setDevicestatue(rs.getString(3));
	            	 device.setDeviceaddress(rs.getString(4));
	            	 list.add(device);
	             }
	            
	             return list; 
	       } catch (SQLException e) {  
             e.printStackTrace();  
          }catch (Exception e) {
     	   e.printStackTrace();
     	 }
  	   return null;
		
	}

	public static boolean deldevice(String deviceid) {
		
		Connection conn = Dao.getConnection();
	     String sql="delete from t_sys_device where id=?"; 
	       try {  
	             PreparedStatement p=conn.prepareStatement(sql);
	             p.setString(1, deviceid);
	             p.executeUpdate();
	            
	             return true; 
	       } catch (SQLException e) {  
            e.printStackTrace();  
         }catch (Exception e) {
    	   e.printStackTrace();
    	 }
 	   return false;
	}

	public static boolean savedevice(Device device) {
		 String id = device.getId();
		 String devicename = device.getDevicename();
		 String deviceaddress =device.getDeviceaddress();
		 String devicestatue = device.getDevicestatue();
		 Connection conn = Dao.getConnection();
		 String sql="insert into t_sys_device(id,devicename,devicestatue,deviceaddress) values (?,?,?,?)";
		 try {
			PreparedStatement preStmt=conn.prepareStatement(sql);
			preStmt.setString(1,id);
			preStmt.setString(2,devicename);
			preStmt.setString(3,devicestatue);
			preStmt.setString(4,deviceaddress);
		    preStmt.executeUpdate();
		    return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return false;
	}

	public static int getuseNum(int dev1) {
		 Connection conn = Dao.getConnection();
         String sql="select usenum from t_sys_device where id = ?"; 
      try {  
             PreparedStatement preStmt=conn.prepareStatement(sql); 
             preStmt.setInt(1,dev1);
             ResultSet rs = preStmt.executeQuery();
             while(rs.next())
             {
                int count = rs.getInt(1);
             
                  return count;
             }
            } catch (SQLException e) {  
                e.printStackTrace();  
             }catch (Exception e) {
        	   e.printStackTrace();
        	 }
		return 0;
	}
	
	public static boolean updatadevices(Device device) {
		 String id = device.getId();
		 String devicename = device.getDevicename();
		 String deviceaddress =device.getDeviceaddress();
		 String devicestatue = device.getDevicestatue();
		 Connection conn = Dao.getConnection();
		 String sql="update  t_sys_device set devicename =?, devicestatue =?,deviceaddress=? where id = ?";
		 try {
			PreparedStatement preStmt=conn.prepareStatement(sql);
			preStmt.setString(1,devicename);
			preStmt.setString(2,devicestatue);
			preStmt.setString(3,deviceaddress);
			preStmt.setString(4,id);
		    preStmt.executeUpdate();
		    return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return false;
	}
}
