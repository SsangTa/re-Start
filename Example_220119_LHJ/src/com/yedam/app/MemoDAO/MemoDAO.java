package com.yedam.app.MemoDAO;

import java.util.List;

public interface MemoDAO {
	//전체조회
	public List<Memo> selectAll();
	
	//단건조회
	public Memo selectMemo(int memoId);
	
	//메모등록
	public void insert(Memo memo);
	
	//메모수정
	public void update(Memo memo);
	
	//메모삭제
	public void delete(int memoId);
	
}
