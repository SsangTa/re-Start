package co.yeda.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Emp13 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. JDBC Driver 로딩
		Class.forName("org.sqlite.JDBC");
		
		//2. DB 서버 접속
		String ur1 = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
		Connection conn = DriverManager.getConnection(ur1);
		
		
		/******************* INSERT *******************/
		//3. Statement or PreparedStatement 객체 생성
		String insert = "INSERT INTO emp13 VALUES (?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(insert);
		pstmt.setInt(1, 777);
		pstmt.setString(2, "Harry");
		pstmt.setString(3, "AD_VP");
		pstmt.setInt(4, 30000);
		pstmt.setDouble(5, 1.5);
		pstmt.setString(6, "IT");
		pstmt.setInt(7, 1234);
		
		//4. SQL 실행
		int result = pstmt.executeUpdate();
		
		//5. 결과값 출력 or 연산
		System.out.println("insert 결과 : " + result);
		
		/******************* UPDATE *******************/
		//3. Statement or PreparedStatement 객체 생성
		String update = "UPDATE emp13 SET first_name = ? WHERE salary = ?";
		pstmt = conn.prepareStatement(update);
		pstmt.setString(1, "Tom");
		pstmt.setInt(2, 50000);
		
		//4. SQL 실행
		result = pstmt.executeUpdate();
		
		//5. 결과값 출력 or 연산
		System.out.println("update 결과 : " + result);
		
		/******************* SELECT *******************/
		//3. Statement or PreparedStatement 객체 생성
		String select = "SELECT * FROM emp13 ORDER BY employee_id = ?";
		pstmt = conn.prepareStatement(select);
		
		//4. SQL 실행
		ResultSet rs = pstmt.executeQuery();
		
		//5. 결과값 출력 or 연산
		while(rs.next()) {
			String name = "사원번호 : " + rs.getInt("employee_id") + "이름 : " + rs.getString("first_name");
			System.out.println(name);
		}
		
		/******************* DELETE *******************/
		//3. Statement or PreparedStatement 객체 생성
		String delete = "DELETE FROM emp13 WHERE employee_id = ?";
		pstmt = conn.prepareStatement(delete);
		pstmt.setInt(1, 777);
		
		//4. SQL 실행
		result = pstmt.executeUpdate();
		
		//5. 결과값 출력 or 연산
		System.out.println("delete 결과 : " + result);
		
		//6. 자원해제하기
		if(rs !=null)rs.close();
		if(pstmt !=null)pstmt.close();
		if(conn !=null)conn.close();
		

	}

}
