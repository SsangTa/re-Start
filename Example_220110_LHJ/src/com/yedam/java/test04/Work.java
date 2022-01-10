package com.yedam.java.test04;

public class Work {
	private static int serialNum = 0;
	
	private int workNo;
	private String workName;
	private String title;
	private boolean complete;
	
	
	public Work(String workName, String title) {
		serialNum++;
		this.workNo = serialNum;
		this.workName = workName; 
		this.title = title;
		this.complete = false;
		
		
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


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isComplete() {
		return complete;
	}


	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
}
