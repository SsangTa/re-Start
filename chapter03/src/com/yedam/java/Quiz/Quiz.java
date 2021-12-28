package com.yedam.java.Quiz;

public class Quiz {

	public static void main(String[] args) {
		int x =10;
		int y =10;
		int result;
		
		//1-1) 부호연산자를 이용하여 변수 x의 값을 음수로 출력하세요. 단, 변수 x의 값은 변하지 말아야 한다.
		int result1 = -x;
		System.out.println(" x : " + result1);
		
		//1-2) 변수 x와 y의 값을 더한 후 y의 값을 증가시키는 연산식을 한줄로 작성하여라.
		int result2 = x + y++ ;
		System.out.println(" y : "  + y);
		System.out.println("result2 : "  + result2);
		//1-3) 변수 x와 y의 값을 더한 값이 20이 되도록 변수 x와 y 중 하나의 변수에 증감연산자를 사용하여 연산식을 한줄로 작성하여라.
		int result3 = x + --y;
		System.out.println("result3 : " + result3);
		//1-4) 변수 x에서 변수 y를 나눈 후 몫과 나머지를 출력하여라.
		System.out.println("몫 : " + (x/y) + "나머지 : " + (x%y));

	}

}
