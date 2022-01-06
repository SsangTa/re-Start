package com.yedam.java.Class;

public class StudentScores {
	//필드
	private String name;
	private int grade;
	private int Korean;
	private int English;
	private int math;
	
	
	//생성자
	StudentScores(String name, int grade){
		this.name = name;
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getKorean() {
		return Korean;
	}


	public void setKorean(int korean) {
		Korean = korean;
	}


	public int getEnglish() {
		return English;
	}


	public void setEnglish(int english) {
		English = english;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}
	
	//메서드
	public int getTotal() {
		int total = 0;
		return Korean + English + math;
		
	}

	public double getAverage() {
		return (double)getTotal() / 3.0;
	}
	
	
	
	
}
