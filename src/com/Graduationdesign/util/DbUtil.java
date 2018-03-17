package com.Graduationdesign.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {
	private static String dbdriver="com.mysql.jdbc.Driver";
	private static String dburl="jdbc:mysql://localhost:3306/graduationdesign";
	private static String dbusername="root";
	private static String dbpassword="123456";
	
	
	@SuppressWarnings("unused")
	
	public static Connection getCon() {
		Connection con=null;
		try {
			Class.forName(dbdriver);
			con=DriverManager.getConnection(dburl, dbusername, dbpassword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	@SuppressWarnings("unused")
	public static void Conclose(Connection con) {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
