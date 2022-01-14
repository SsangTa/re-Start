package com.yedam.java.Signup;

import java.sql.SQLException;

import com.yedam.java.common.DAO;

public class SignupDAOImpl extends DAO implements SignupDAO {
	
	private static SignupDAO instance = new SignupDAOImpl();
	private SignupDAOImpl() {}
	public static SignupDAO getInstance() {
		return instance;
	}
	
	
	@Override
	public void insertSignup(Signup signup) {
		try {
			connect();
			String insert = "INSERT INTO signup VALUES (?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, signup.getId());
			pstmt.setString(2, signup.getPw());
			pstmt.setString(3, signup.getContent());
			
			int result = pstmt.executeUpdate();
			System.out.println("회원가입되었습니다. 환영합니다!!");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

}
