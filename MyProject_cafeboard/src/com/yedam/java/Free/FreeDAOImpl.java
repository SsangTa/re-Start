package com.yedam.java.Free;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common.DAO;

public class FreeDAOImpl extends DAO implements FreeDAO {
	//싱글톤
	private static FreeDAOImpl instance = new FreeDAOImpl();
	private FreeDAOImpl() {}
	public static FreeDAO getinstance() {
		return instance;
	}
	
	
	
	
	
	@Override
	public List<Free> selectAll() {
		List<Free>list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM free ORDER BY title";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Free free = new Free();
				free.setTitle(rs.getString("title"));
				free.setWriter(rs.getString("writer"));
				free.setContent(rs.getString("content"));
				free.setTime(rs.getString("time"));
				
				list.add(free);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Free selectOne(String title) {
		Free free = null;
		try {
			connect();
			connect();
			String select = "SELECT * FROM free WHERE title = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				free = new Free();
				free.setTitle(rs.getString("title"));
				free.setWriter(rs.getString("writer"));
				free.setContent(rs.getString("content"));
				free.setTime(rs.getString("time"));
				
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return free;
	}

	@Override
	public void insert(Free free) {
		try {
			connect();
			String insert = "INSERT INTO free VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, free.getTitle());
			pstmt.setString(2, free.getWriter());
			pstmt.setString(3, free.getContent());
			pstmt.setString(4, free.getTime());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 등록되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

	@Override
	public void update(Free free) {
		try {
			connect();
			String update = "UPDATE free SET title = ? WHERE content = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, free.getTitle());
			pstmt.setString(2, free.getContent());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 수정되었습니다.");
					
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

	@Override
	public void delete(String title) {
		try {
			connect();
			String delete = "DELETE FROM free WHERE title = ? ";
			pstmt = conn.prepareStatement(delete);
			pstmt.setString(1, title);
			
			int result = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

}
