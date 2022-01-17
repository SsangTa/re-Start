package com.yedam.java.Free;

import java.util.List;

public interface FreeDAO {
	//전체조회
	public List<Free> selectAll();
	
	//단건조회
	public Free selectOne(String title);
	
	//등록
	public void insert(Free free);
	
	//수정
	public void update(Free free);
	
	//삭제
	public void delete(String title);
	
	
	
}
