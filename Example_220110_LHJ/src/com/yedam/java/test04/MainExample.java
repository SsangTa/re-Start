package com.yedam.java.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MainExample {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		List<Work1> list = new ArrayList<>();

		Work1 work =null;
		int workNo =0;
		
		while (run) {
			System.out.println("=== 1.할일입력 | 2.전체조회 | 3.할일조회 | 4.할일완료 | 5.종료 ===");
			System.out.println("선택 > ");
			int menuNo = Integer.parseInt(scanner.nextLine());
			
			switch(menuNo) {
			case 1:
				System.out.println("할일 > ");
				String workName = scanner.nextLine();
				work = new Work1(workName);
				list.add(work);
				break;
			case 2:
				for(Work1 w : list) {
					System.out.println(w.getWorkNo() + "번 " + w.getWorkName() + " " + (w.isComplete() ? "완료" : "미완료"));
				}
				
				break;
			case 3:
				for(Work1 w : list) {
					if(!w.isComplete()) {
				    	System.out.println(w.getWorkNo() + "번 " + w.getWorkName() + " " + (w.isComplete() ? "완료" : "미완료"));
				    }
				}
				break;
				
			case 4:
				System.out.print("완료 할 일을 선택해주세요> ");
				workNo = Integer.parseInt(scanner.nextLine());
				for(Work1 w : list) {
					if(w.getWorkNo() == workNo) {
						if(w.isComplete()) {
							System.out.println("해당 할 일은 이미 완료되었습니다.");
						}else {
							w.setComplete(true);
							System.out.println("해당 할 일은 완료처리하였습니다.");
						}
					}
				}
				
				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}

}
