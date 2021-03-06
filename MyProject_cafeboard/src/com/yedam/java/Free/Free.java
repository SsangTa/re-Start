package com.yedam.java.Free;

public class Free {
	private int num;
	private String title;
	private String writer;
	private String content;
	private String time;
	
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	@Override
	public String toString() {
		
		return num + "번 | " + "제목 : " + title + " | 작성자 : " + writer + " | 내용 : " + content + " | 작성시간 : " + time;
	}
	
	
}
