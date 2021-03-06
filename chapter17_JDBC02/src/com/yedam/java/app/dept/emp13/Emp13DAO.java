package com.yedam.java.app.dept.emp13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Emp13DAO {
	
	//DB 연결정보
	private String jdbc_driver = "org.sqlite.JDBC";
	private String jdbc_ur1 = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
	
	//각 메서드에서 공통적으로 사용하는 필드
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	//싱글톤
	private static Emp13DAO instance = new Emp13DAO();
	private Emp13DAO () {}
	static Emp13DAO getInstance() {
		return instance;
	}
	
	//JDBC Driver 로딩
	//DB 서버 접속
	// -> Connect()메서드
	
	
	
	public void connect() {
		try {
			Class.forName(jdbc_driver);
			
			conn = DriverManager.getConnection(jdbc_ur1);
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC Driver 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB와 연결 실패");
		}
		
	}
	
	//자원해제 -> disconnect 메서드
	public void disconnect() {
		try {
			if(rs !=null)rs.close();
			if(pstmt !=null)pstmt.close();
			if(conn !=null)conn.close();
		}catch(SQLException e) {
			System.out.println("자원이 정상적으로 해제되지 못 했습니다.");
		}
	}
	
	
	//PreparedStatement 객체 생성
	//SQL 실행
	//결과값 출력 or 연산
	// -> CRUD 메서드
	
	//전체조회
	public List<Emp13> selectAll(){
		List<Emp13> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM emp13 ORDER BY employee_id";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Emp13 emp = new Emp13();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getString("commission_pct"));
				emp.setDepartmentName(rs.getString("departnent_name"));
				emp.setLocationId(rs.getInt("location_id"));
				
				list.add(emp);
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	//단건조회
	public Emp13 selectOne(int employeeId) {
		Emp13 emp = null;
		try {
			connect();
			String select = "SELECT * FROM  emp13 WHERE employee_id =?";
			pstmt = conn.prepareStatement(select);
			pstmt.setInt(1, employeeId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				emp = new Emp13();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getString("commission_pct"));
				emp.setDepartmentName(rs.getString("departnent_name"));
				emp.setLocationId(rs.getInt("location_id"));
				
			}
			
		}catch(SQLException e ) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return emp;
	}
	
	
	//등록
	public void insert(Emp13 emp) {
		try {
			connect();
			String insert = "INSERT INTO emp13 VALUES (?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getJobId());
			pstmt.setInt(4, emp.getSalary());
			pstmt.setString(5, emp.getCommissionPct());
			pstmt.setString(6, emp.getDepartmentName());
			pstmt.setInt(7, emp.getLocationId());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 등록되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	//수정
	public void update(Emp13 emp) {
		try {
			connect();
			String update = "UPDATE emp13 SET employee_id =? WHERE first_name = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			
            int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 수정되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	//삭제
	public void delete(Emp13 emp) {
		try {
			connect();
			String delete = "DELETE FROM emp13 WHERE employee_id = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, employeeId);
			
            int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 삭제되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
			
}
