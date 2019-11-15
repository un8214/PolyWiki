package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;

public class UserDAO extends SuperDAO {
	
	public UserDAO() {
		super();
		
	}
	/**
	 * 손님 유저를 추가합니다.
	 * @param ip ip주소
	 * @return 정상입력 0 중복된 계정 있음 -1 데이터베이스 오류 -2
	 */
	public int addGuest(String ip) {
		try {
			//이미 중복된 계정이 있는지 확인
			pstmt = conn.prepareStatement("Select ip from users where ip = ?");
			pstmt.setString(1, ip);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				return -1; // 데이터베이스에 쿼리되는 게 있으면 -1 리턴
			}
			
			//데이터베이스에 계정 추가
			pstmt = conn.prepareStatement("insert into users(ip) value(\"?\");");
			pstmt.setString(1, ip);
			return 0;
		}catch(Exception e){
			return -2;
		}
	}
	
	
	public void userdelete() {
		
	}
	
}
