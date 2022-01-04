package com.yedam.java.ch0502;

import java.util.Scanner;

public class Homework1230 {

	public static void main(String[] args) {
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
				int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
				
				
				
				//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
				System.out.println("문제1");
				for(int i=0; i<arr1.length; i++) {
					if(arr1[i] ==60 ) {
						System.out.println(i);
					}
				}
				
				
				
				//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
				System.out.println();
				System.out.println("문제2");
				for(int i=0; i<arr1.length; i++) {
					if(i == 3) {
						continue;
					}
					System.out.printf(arr1[i]+" ");
				}
				
				//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
				System.out.println();
				System.out.println();
				System.out.println("문제3");
				
				Scanner scanner = new Scanner(System.in); 
				int choice = Integer.parseInt(scanner.nextLine());
				arr1[choice] = 1000;
				
			    
				int temp = arr1[choice];
				arr1[choice] = temp;
				
				for(int i=0; i<arr1.length; i++) {
					System.out.printf(arr1[i]+" ");
				}
				
				//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
				System.out.println();
				System.out.println();
				System.out.println("문제4");
				
				 int max = arr1[0];
			     int min = arr1[0];
			 
			        for (int i = 0; i < arr1.length; i++) {
			            if (max < arr1[i])
			                max = arr1[i];
			 
			            if (min > arr1[i])
			                min = arr1[i];
			        }
			 
			        System.out.println("최대값 : " + max + "/ 최소값 : " + min);
			 
			    
				
				//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
			    System.out.println();
					
				System.out.println("문제5");
				
				int num[] = new int[10];     //크기가 10인 정수형 배열 선언
				  System.out.println("정수 10개를 입력하세요.");
				  for(int i=0; i<10; i++){
				   num[i] = scanner.nextInt();
				   
				  }
				  
				  for(int i=0 ; i<10; i++){
				   if(num[i]%3==0){
				    if(num[i]==0) continue;    //값이 0일 때는 출력 반복문 넘기기
				    System.out.print(num[i]+" ");   //그 외의 3의 배수 출력.
				   }
				  }
				  
				  scanner.close();
				 
				  
			        
			        
				//추가문제)
				// 문제1) 다음은 키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
				//		 실행결과를 보고, 알맞게 작성해보세요.
				//		 문제출처, 이것이 자바다 183페이지 9번
				
				boolean run = true;
				Scanner scanner = new Scanner(System.in); 
				int[] scores = null;
				int studentNum = 0;
				
				while(run){
					System.out.println("---------------------------------------------");
					System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
					System.out.println("---------------------------------------------");
					System.out.println("선택>");
					int menuNo = scanner.nextInt();
					
					switch(menuNo) {
					case 1:
						System.out.println("학생 수 >");
						studentNum = scanner.nextInt();
						scores = new int[studentNum];
						break;
					case 2:
						for(int i=0; i<scores.length; i++) {
							System.out.print("scores["+i+"]>");
							scores[i] = scanner.nextInt();
						}
						break;
					case 3:
						for(int i=0; i<scores.length; i++) {
							System.out.println("scores["+i+"] : " + scores[i]);
						}
						break;
					case 4:
						int max = 0;
						int sum = 0;
						for(int i=0; i<scores.length; i++) {
							if(max < scores[i]) {
								max = scores[i];
							}
							
							sum += scores[i];
						}
						double avg = (double)sum / scores.length;
						System.out.println("최고점수 : " + max);
						System.out.println("평균점수 : " + max);
						
						break;
					case 5:
						run = false;
						System.out.println("프로그램 종료");
						break;
						
					}
					
				}
				
				  


	}

}
