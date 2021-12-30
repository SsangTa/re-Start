package com.yedam.java.ch0401;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//If문
		
		//예제1 - 점수를 입력받아서 70점 이상이면 합격, 미만이면 불합격
		
		int score = Integer.parseInt(scanner.nextLine());
		
		if(score >=70) {
			System.out.println("합격");
		}else {		
			System.out.println("불합격");
		}
		
		//예제2 - 정수 한개를 입력받아서 해당 점수가 2의 배수인지 확인
		
		int num = Integer.parseInt(scanner.nextLine());
		
		if(num%2 == 0) {
			System.out.println("2의 배수");
		}else {
			System.out.println("2의 배수가 아닙니다.");
		}
		
		
		//예제3 - 점수는 0~100점 사이의 값이어야 하며 벗어날경우 "점수 입력 오류!" 출력
		//       60점 이상이면 합격, 미만이면 불합격
		
		/*
		int score = Integer.parseInt(scanner.nextLine());
		
		if((score>=0) && (score<=100)) {
			if(score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			} 
		} else {
			System.out.println("점수 입력 오류!");
		}
		
		
		//예제4 - 놀이기구, 키 110cm이상일 경우 라바 트위스터를 탑승
		//       미만일경우 보호자가 있는지 체크 -> 있으면 탑승
		//       없으면 "보호자와 같이오세요." 출력
		/* 내답안
		double height = Integer.parseInt(scanner.nextLine());
		
		if(tall >= 110) {
			System.out.println("탑승");
		}else if(tall <110) {
			int answer = Integer.parseInt(scanner.nextLine());
			if(answer == Y) {
				System.out.println("탑승")
			}else {
				System.out.println("보호자와 같이 오세요.");
			}
		}
		*/
		
		/*답안
		double height = Double.parseDouble(scanner.nextLine());
		
		if(height >= 110) {
			System.out.println("라바 트위스터를 탑승할 수 있습니다.");
		}else {
			System.out.println("보호자와 함께 오셨나요?");
			System.out.println("1:보호자와 동행 2:혼자");
			int selected = Integer.parseInt(scanner.nextLine());
			if (selected == 1) {
				System.out.println("보호자와 라바트위스터를 탑승하세요.");
			}else {
				System.out.println("보호자와 함께 오세요.");
			}
		}
		*/
		//switch문
		
		//예제1 - 정수를 입력받아 0일경우 false, 1일경우 true, 둘다 아닐경우 "체크오류"
		/*내 답안
		int num = Integer.parseInt(scanner.nextLine());
		
		switch(num) {
		case 0:
			System.out.println("false");
			break;
		case 1:
			System.out.println("true");
			break;
			default:
				System.out.println("체크오류");
				break;
		}
		*/
		
		/*교수님 답안
		int num = Integer.parseInt(scanner.nextLine());
		
		switch(num) {
		case 0:
			System.out.println("false");
			break;
		case 1:
			System.out.println("true");
			break;
			default:
				System.out.println("체크오류!");
				break;
		}
		*/
		
		//예제2 - 정수를 입력받아 홀수인지 짝수인지를 판별 
		
		
		int num = Integer.parseInt(scanner.nextLine());
				
		switch(num%2) {
		case 0: //2의배수 -> 짝수
			System.out.println("짝수");
			break;
		case 1: //2n+1 -> 홀수
			System.out.println("홀수");
			break;
		}
		
	

	}

}
