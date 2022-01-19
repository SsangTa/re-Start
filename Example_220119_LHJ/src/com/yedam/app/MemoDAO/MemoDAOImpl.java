package com.yedam.app.MemoDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO.DAO;

public class MemoDAOImpl extends DAO implements MemoDAO {
	
	private static MemoDAO instance = new MemoDAOImpl();
	private MemoDAOImpl() {}
	public static MemoDAO getInstance() {
		return instance;
	}
	
	
	@Override
	public List<Memo> selectAll() {
		List<Memo>list = new ArrayList();
		try {
			connect();
			String select = "SELECT * FROM	Memo ORDER BY memo_id";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Memo memo = new Memo();
				memo.setMemoId(rs.getInt("memo_id"));
				memo.setMemoTitle(rs.getString("memo_title"));
				memo.setMemoWriter(rs.getString("memo_writer"));
				memo.setMemocontent(rs.getString("memo_content"));
				
				list.add(memo);
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Memo selectMemo(int memoId) {
		Memo memo = null;
		try {
			connect();
			String select = "SELECT * FROM Memo WHERE memo_id = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setInt(1, memoId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				memo = new Memo();
				memo.setMemoId(rs.getInt("memo_id"));
				memo.setMemoTitle(rs.getString("memo_title"));
				memo.setMemoWriter(rs.getString("memo_writer"));
				memo.setMemocontent(rs.getString("memo_content"));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return memo;
	}

	@Override
	public void insert(Memo memo) {
		try {
			connect();
			String insert = "INSERT INTO Memo VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, memo.getMemoId());
			pstmt.setString(2, memo.getMemoTitle());
			pstmt.setString(3, memo.getMemoWriter());
			pstmt.setString(4, memo.getMemocontent());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println(result + "건이 등록되었습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

	@Override
	public void update(Memo memo) {
		try {
			connect();
			String update = "UPDATE Memo SET memo_id = ? WHERE memo_content = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1, memo.getMemoId());
			pstmt.setString(2, memo.getMemocontent());
			
			int result = pstmt.executeUpdate();
			
			if(result >0 ) {
				System.out.println(result + "건이 수정되었습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		} 

	}

	@Override
	public void delete(int memoId) {
		try {
			connect();
			int delete = "DELETE FROM Memo WHERE memo_id = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, memoId);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

}
