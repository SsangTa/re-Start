package com.yedam.java.notice;

import java.util.List;

public interface NoticeDAO {
	//전체조회
	public List<Notice> selectAll();
	
	//단건조회
	public Notice selectnotice(String noticeName);
	
	//글등록
	public void insert(Notice notice);
	
	//글수정
	public void update(Notice notice);
}
