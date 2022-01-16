package com.yedam.java.notice;

public class Notice {
	public String noticeName;
	public String noticeWriter;
	public String noticeContent;

	
	public String getNoticeName() {
		return noticeName;
	}
	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}
	public String getNoticeWriter() {
		return noticeWriter;
	}
	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	@Override
	public String toString() {
		
		return "글제목 : " + noticeName + ", 작성자 : " + noticeWriter + ", 내용 : " + noticeContent; 
	}
	
	
}
