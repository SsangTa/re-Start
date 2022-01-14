package com.yedam.java.Signup;

public class Signup {
	private String id;
	private String pw;
	private String content;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "아이디 : " + id + ", 비밀번호 : " + pw + ", 가입동기 : " + content;
	}
	
	
}
