package com.yedam.java.Example;

public class Grade {
	//필드
	int math;
	int science;
	int english;
	
	
	//생성자
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
		
	}
	
	
	//메서드
	double average() {
		double avg = 0;
		int sum = math + science + english;
		avg = sum / 3.0;
		return avg;
	}
	
	
	

}
