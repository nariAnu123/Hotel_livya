package test;

import java.sql.*;

public class DBConnection 
{
	private static Connection con;
	private DBConnection() {
		
	}
	static {
		try {
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.durl,DBInfo.uname,DBInfo.pword);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		return con;
	}
}
