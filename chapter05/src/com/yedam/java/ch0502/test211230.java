package com.yedam.java.ch0502;

import java.util.Scanner;

public class test211230 {

	public static void main(String[] args) {
		//문제1
		System.out.println("----- 문제1 -----");
		int intValue = 10;
		int sum = 0;
		double doubleValue =2.0;
		int intValue1 = (int) doubleValue;
		
		System.out.println(intValue);
		System.out.println(intValue1);
		
		sum = intValue + intValue1;
		System.out.println(intValue + intValue1);
		
		//문제2
		System.out.println("----- 문제2 -----");
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result =((num1 >10) && (num2 >10));
		System.out.println(result);
		result =((num1 >10) || (num2 >10));
		System.out.println(result);
		System.out.println(!result);
		
		//문제3
		System.out.println("----- 문제3 -----");
		
		int num3 = 10;
		int num4 = 2;
		char operator = '-';
		
		switch(operator) {
		case '+':
			System.out.println(num3 + num4);
			break;
		case '-':
			System.out.println(num3 - num4);
			break;
		case '*':
			System.out.println(num3 * num4);
			break;
		case '/':
			System.out.println(num3 / num4);
			break;
			default:
		}
			
		//문제4
		System.out.println("----- 문제4 -----");	
		Scanner scanner = new Scanner(System.in);
		int m = Integer.parseInt(scanner.nextLine());
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i=1; i<=n; i++ ) {
				System.out.println(m + "X" + n + " = " + (m*i));
			}
		
		
	         
	
	
		

	}

}
