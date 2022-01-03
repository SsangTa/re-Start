package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {

	public static void main(String[] args) {
		// print(), print() 메소드
		System.out.println("오늘은 월요일입니다.");
		System.out.print("2021년");
		System.out.print("12월");
		System.out.print("27일 \n");
		
		//printf()
		int x = 1;
		int y = 2;
		System.out.println("1. x : " + x + ", y : " + y);
		System.out.printf("2. x : %d, y : %d\n", x, y);
		
		int result = x + y;
		System.out.printf("%d + %d = %d\n", x , y, result);
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		// ctrl + shift + o > 눌러줘야 Scanner 쓸 수 있음 . 위에 패키지밑 impotr 라인이 생겨야 Scanner 사용가능
		
		String testData = scanner.nextLine();
		System.out.println(testData);
		
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
	}

}
