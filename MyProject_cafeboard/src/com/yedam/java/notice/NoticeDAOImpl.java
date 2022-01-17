package com.yedam.java.notice;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common.DAO;

public class NoticeDAOImpl extends DAO implements NoticeDAO {
	
	private static NoticeDAO instance = new NoticeDAOImpl();
	private NoticeDAOImpl() {}
	public static NoticeDAO getInstance() {
		return instance;
	}
	
	
	
	@Override
	public List<Notice> selectAllno() {
		List<Notice> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM notice ORDER BY title";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Notice notice = new Notice();
				notice.setNoticeName(rs.getString("title"));
				notice.setNoticeWriter(rs.getString("writer"));
				notice.setNoticeContent(rs.getString("content"));
				
				list.add(notice);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return list;
	}

	@Override
	public Notice selectnotice(String noticeName) {
		Notice notice = null;
		try {
			connect();
			String select = "SELECT * FROM notice WHERE notice_name = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, noticeName);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				notice = new Notice();
				notice.setNoticeName(rs.getString("notice_name"));
				notice.setNoticeWriter(rs.getString("notice_writer"));
				notice.setNoticeContent(rs.getString("notice_content"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return notice;
	}

	@Override
	public void insert(Notice notice) {
		try {
			connect();
			String insert = "INSERT INTO notice VALUES (?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, notice.getNoticeName());
			pstmt.setString(2, notice.getNoticeWriter());
			pstmt.setString(3, notice.getNoticeContent());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상 등록 되었습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}


	}

	@Override
	public void update(Notice notice) {
		try {
			connect();
			String update = "UPDATE notice SET notice_name = ? WHERE notice_content = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, notice.getNoticeName());
			pstmt.setString(2, notice.getNoticeContent());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상 처리 되었습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

		
	}
	
/*	public void delete(Notice notice) {
		try {
			connect();
			String delete = "DELETE FROM notice WHERE title = ? ";
			pstmt = conn.prepareStatement(delete);
			pstmt.setString(1, notice.getNoticeName());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
*/	
	@Override
	public void delete(String noticeName) {
		try {
			connect();
			String delete = "DELETE FROM notice WHERE title = ? ";
			pstmt = conn.prepareStatement(delete);
			pstmt.setString(1, noticeName);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	
	

}
