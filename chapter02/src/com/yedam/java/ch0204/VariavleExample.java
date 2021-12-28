package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariavleExample {

	public static void main(String[] args) {
		// print(), print() 메소드
		System.out.println("오늘은 월요일입니다.");
		System.out.print("2021년 ");
		System.out.print("12월 ");
		System.out.print("27일 \n");
		
		//printf()
		int x = 1;
		int y = 2;
		System.out.println("1. x : " + x + ", y : " + y);
		System.out.printf("2. x : %d, y : %d\n", x, y);
		
		int result = x + y;
		System.out.printf("%d + %d = %d\n", x, y, result);
		
		//Scanner
		Scanner scanner = new Scanner(System.in);  
		// ctrl + shift + O > 눌러줘야 Scanner 쓸 수 있음.. 위쪽 보면 패키지밑에 import 라인이 생겨야 Scanner 사용가능하짐
		
		String testData = scanner.nextLine();
		System.out.println(testData);
		
		/*
		 * 
		 */
		String inputData;
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : " + inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("종료");
		// while 문은 중괄호 안을 무한반복함 
   
		
		{
		String name = "감자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		System.out.println("이름 : "  + name);
		System.out.print("나이 : " + age + "\n");
		System.out.printf("전화 : %1$s-%2$s-%3$s", tel1, tel2,tel3);
		}
		
		
		
		
		
	}

}
