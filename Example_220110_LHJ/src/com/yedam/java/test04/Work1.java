package com.yedam.java.test04;

public class Work1 {
	private static int serialNum = 0;
	
	private int workNo;       //번호
	private String workName;  //할일
//	private String title;
	private boolean complete; //완료여부
	
	
	public Work1(String workName) {
		serialNum++;
		this.workNo = serialNum;
		this.workName = workName; 
//		this.title = title;
		this.complete = false;
		
		
	}


	public void Work(String workName2) {
		// TODO Auto-generated constructor stub
	}


	public int getWorkNo() {
		return workNo;
	}


	public void setWorkNo(int workNo) {
		this.workNo = workNo;
	}


	public String getWorkName() {
		return workName;
	}


	public void setWorkName(String workName) {
		this.workName = workName;
	}


//	public String getTitle() {
//		return title;
//	}


//	public void setTitle(String title) {
//		this.title = title;
//	}


	public boolean isComplete() {
		return complete;
	}


	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
}
