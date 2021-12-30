package com.yedam.java.example;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// ATM기가 있고 입금,출금,잔액조회,종료
		// 1. 출금을 할때 잔액보다 많을 경우 잔액부족 안내문구 출력
		// 2. 입금,출금,잔액조회 > 비밀번호로 정보확인 (pw : 1234 )
		
		boolean run = true;
		int balance = 0;
		int PW = 1234;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.입금 | 2.출금 | 3.잔액조회 | 4.죵료");
			System.out.println("--------------------------------");
			System.out.println("선택>");
			int menuNo = scanner.nextInt();
			
			if(menuNo == 4) {
				run =false;
				continue;
			}
			
			
			System.out.println("비밀번호를 입력하세요.");
			int PW = scanner.nextInt();
			if(PW ==1234) {
			switch(menuNo) {
			case 1:
							
					System.out.println("입금");
					balance += scanner.nextInt();
				
				break;
			case 2:
				
				System.out.println("출금");
				balance -= scanner.nextInt();
				
				break;
			case 3:
				
				System.out.println("잔액조회" + balance);
				
				break;
			
			case 4:
				run = false;
				break;
			default:
				
			}
			}
		}
				

	}

}
