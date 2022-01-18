package com.yedam.java.Signup;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public int login(String id, String pw) {
		String select = "SELECT pw FROM signup WHERE id = ?";
		try {
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(pw)) {
					return 1; //로그인 성공
				}else {
					return 0; //비밀번호 불일치
				}
			}
			return -1; //아이디가 없음
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return -2; //DB 오류	
	}
	@Override
	public void login(Signup signup) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Signup selectUserInfo(String id, String pw) {
		Signup signup = null;
		try {
		connect();
		String select = "SELECT * FROM  signup WHERE id =? AND pw = ?";
		pstmt = conn.prepareStatement(select);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			signup = new Signup();
			signup.setId(rs.getString("id"));
			signup.setPw(rs.getString("pw"));
		}
		
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		disconnect();
	}	
	return signup;
	}

	
	public List<Signup> selectAll(){
		List<Signup>list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM Signup ORDER BY id";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Signup signup = new Signup();
				signup.setId(rs.getString("id"));
				signup.setPw(rs.getString("pw"));
				signup.setContent(rs.getString("content"));
				
				list.add(signup);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	public void update(Signup signup) {
		try {
			connect();
			String update = "UPDATE signup SET id = ? AND pw = ? WHERE content = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, signup.getId());
			pstmt.setString(2, signup.getPw());
			pstmt.setString(3, signup.getContent());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 수정되었습니다.");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	public void delete(Signup signup) {
		try {
			connect();
			String delete = "DELETE FROM signup WHERE id = ? AND pw = ? ";
			pstmt = conn.prepareStatement(delete);
			pstmt.setString(1, signup.getId());
			pstmt.setString(2, signup.getPw());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	
}
