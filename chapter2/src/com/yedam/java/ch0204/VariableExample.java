package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {

	public static void main(String[] args) {
		// print(), print() �޼ҵ�
		System.out.println("������ �������Դϴ�.");
		System.out.print("2021��");
		System.out.print("12��");
		System.out.print("27�� \n");
		
		//printf()
		int x = 1;
		int y = 2;
		System.out.println("1. x : " + x + ", y : " + y);
		System.out.printf("2. x : %d, y : %d\n", x, y);
		
		int result = x + y;
		System.out.printf("%d + %d = %d\n", x , y, result);
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		// ctrl + shift + o > ������� Scanner �� �� ���� . ���� ��Ű���� impotr ������ ���ܾ� Scanner ��밡��
		
		String testData = scanner.nextLine();
		System.out.println(testData);
		
		String inputData;
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ� : " + inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("����");
		// while ���� �߰�ȣ ���� ���ѹݺ���
	}

}
