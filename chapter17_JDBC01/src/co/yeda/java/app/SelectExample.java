package co.yeda.java.app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. JDBC Driver 로딩
		Class.forName("org.sqlite.JDBC");
		
		//2. DB 서버 접속
		String ur1 = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
		Connection conn = DriverManager.getConnection(ur1);
		
		//3. Statement or PreparedStatement 객체 생성
		Statement stmt = conn.createStatement();
		//4. SQL 실행
		String selete = "SELECT * FROM employees";
		ResultSet rs = stmt.executeQuery(selete);
		
		//5. 결과값 출력 or 연산
		while(rs.next()) {
			String name = "이름 : " + rs.getString("first_name") + " " + rs.getString("last_name");
			System.out.println(name);
		}
		//6. 자원해제하기
		if(rs !=null)rs.close();
		if(stmt !=null)stmt.close();
		if(conn !=null)conn.close();

	}

}