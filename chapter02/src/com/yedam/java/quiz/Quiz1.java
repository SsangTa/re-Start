package com.yedam.java.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		//문제1
		int a = 10, b = 50, c =90;
		
		System.out.println("a:" + a + ",b:" + b + ",c:" +c );
		
		int temp = a;
		a=b;
		b=c;
		c=temp;
		
		System.out.println("a:" + a + ",b:" + b + ",c:" +c);
		
				

	}

}
