package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SuperDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public SuperDAO() throws Exception{
			String dbURL = "jdbc:mysql://localhost:3306/polywiki?serverTimezone=UTC";
			String dbID = "admin";
			String dbPassword="0000";
			Class.forName("conn.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
	}
	/*
	public int sqlStatement(String sql) {
		pstmt = conn.prepareStatement(sql);
		
		return -1;
	}
	*/
}
