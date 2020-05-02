package com.staff.system.business.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Dao {
	 public static Connection getConnection()
	    {
	        Connection conn = null;
	        String url = "jdbc:mysql://localhost:3306/staffsystem";
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection(url,"root","12345678");
	            
	        }
	        catch(ClassNotFoundException e)
	        {
	            e.printStackTrace();
	            System.out.println("加载驱动错误");
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	            System.out.println("数据库无法连接");
	        }
	        return conn;
	    }
	     
	    public static void close(ResultSet rs,PreparedStatement p,Connection conn)
	    {
	        try
	        {
	            rs.close();
	            p.close();
	            conn.close();
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	            System.out.println("数据库关闭异常");
	        }
	    }
	}

