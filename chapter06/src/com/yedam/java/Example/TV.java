package com.yedam.java.Example;

public class TV {
	//필드
	String company;
	int year = 2017;
	int inch = 32;
	
	//생성자
	TV(String company, int year, int inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
		
	}
	
	//메소드
	void showInfo() {
		System.out.println("회사 : " + company + "년식 : " + year + "인치 : " + inch);
	}

}
