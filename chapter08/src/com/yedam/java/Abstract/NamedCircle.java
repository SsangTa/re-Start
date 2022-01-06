package com.yedam.java.Abstract;

public class NamedCircle extends Circle {
	//필드
	private String name;
	
	//생성자
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}
	
	//메서드
	public void show() {
		System.out.print(name + ", 반지름 = " + getRadius());
	}
	
}
