package com.yedam.java.ch0302;

import java.util.Scanner;

public class Quizp129Q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		double firstNum = Double.parseDouble(scanner.nextLine());
		System.out.print("두번째 수 : ");
		double SecondNum = Double.parseDouble(scanner.nextLine());
		
		System.out.println("------------------------------");
		if(SecondNum !=0.0) {
			System.out.println("결과 : " + (firstNum/SecondNum));
		} else {
			System.out.println("결과 : 무한대 ");
		}

	}

}
