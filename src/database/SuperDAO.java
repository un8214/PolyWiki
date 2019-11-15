package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SuperDAO {

	protected Connection conn;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	public SuperDAO(){
		try {
			String dbURL = "jdbc:mysql://localhost:3306/polywiki?serverTimezone=UTC";
			String dbID = "root";
			String dbPassword="0000";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
