package com.yedam.java.ch0402;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		/*
		//for문
		
		//예제1 - 0부터 90까지 출력 단 10단위로 출력
		for(int i=0; i<=90; i+=10) {
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		
		//예제2 - 0에서부터 20까지 출력, 짝수만 출력
		for(int i=0; i<=20; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
				
		}
		
		//예제3 - 숫자를 5번 입력하고, 입력받을때마다 더해지는 값을 출력
		/* 출력예시 :
		 *   숫자를 5개를 입력하세요.
		 *   숫자를 입력하세요.
		 *   5
		 *   출력 : 5
		 *   숫자를 입력하세요.
		 *   6
		 *   출력 : 11
		 */
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하세요.");
		
		int sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.println("숫자를 입력하세요.");
			int value = Integer.parseInt(scanner.nextLine());
			sum += value;
			System.out.println("출력 : " + sum);
		}
		
		
		
		//예제4 - 1부터 사용자가 입력한 숫자까지 합계
		
		int max = Integer.parseInt(scanner.nextLine());
		sum =0;
		for(int i=1; i<=max; i++) {
			sum += i;
			
		}
		System.out.println("1~" +max+"까지 합 : " + sum);
		*/
		
		
		
		
		
		// 문제1) 책 161페이지 5번, for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세요.
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i=1; i<=5; i++) {
			for(int x=1; x<=i; x++) {
				System.out.print("*");
				if(i==x) {
					System.out.println();
				}
			}
		}
		
		/*교수님 답
		 *   String tree ="";
		 *   for(int i=1; i<=5; i++) {
		 *       tree = tree + "*";
		 *       System.out.println(tree);
		 *   }
		 */
		

		// 문제2) 책 160페이지 2번, for문을 이용해서 1부터 100까지의 정수 중에서 2의 배수가 아닌 숫자의 개수를 구하세요.
		//		 단, continue 문을 사용한다.
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				continue;
			}
			sum++ ;
			
		}
		System.out.println(sum);

		// 문제3) 책 161페이지 4번, 중첩 for문을 이용하여 방정식 4x+5y = 60의 모든 해 중 첫번째로 구해지는 값을 (x, y) 형태로 출력해보세요.
		//       단, x와 y는 10이하의 자연수입니다.
		
		Out : for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x + 5*y) == 60){
					System.out.println("(" + x + "," + y + ")");  // System.out.printf(" %d , %d)\n", x, y);
					break Out;
				}
			}
		}
		
					
		// 문제4) do ~ while문과 Math.random()함수를 이용하여 1 ~ 10의 정수 중 7이라는 수가 나올때까지 숫자를 출력하는 코드를 작성해보세요.
		int num = 0;
		do {
			 num = (int)(Math.random()*10) + 1;
			System.out.println(num);
		}while(num !=7 );
		
		
		// 문제5) 책 161페이지 3번, while문과 Math.random() 함수를 이용해서 2개의 주사위를 던졌을때 나오는 숫자를 (숫자1, 숫자2) 형태로 출력하고,
		//		 숫자의 합이 5가 아니면 계속 주사위를 던지고, 숫자의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		//		 또한 주사위를 몇번 던졌는지 횟수를 출력하세요.
		//		 숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3),(3,2)
		
		
		int totalCount = 0;
		while(true) {
			//두개의 숫자 > 주사위를 던진 랜덤한 값
			int x = (int)(Math.random()*6) + 1;
			int y = (int)(Math.random()*6) + 1;
			totalCount++;
			//두개의 숫자를 더한 값이 5가 아닐 경우에만 반복
			int result = x + y;
			if(result == 5) {
				System.out.printf("(%d , %d)\n", x, y);
				System.out.println("주사위를 던진 횟수 : " + totalCount);
				break;
			}
				
					
		}
				
		
		
		
		
		//P161. 7번
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택");
			int menuNo = Integer.parseInt(scanner.nextLine());
			
			switch(menuNo) {
			case 1://예금
				System.out.print("예금액>");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2://출금
				System.out.print("출금액>");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3://잔고
				System.out.println("잔고>" + balance);
				break;
			case 4://종료
				run = false;
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
