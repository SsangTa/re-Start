package com.yedam.java.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MainExample {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		List<Work> list = new ArrayList<>();
		int menNo;
		
		
		while (run) {
			System.out.println("=== 1.할일입력 | 2.전체조회 | 3.할일조회 | 4.할일완료 | 5.종료 ===");
			System.out.println("선택 > ");
			int menuNo = Integer.parseInt(scanner.nextLine());
			
			switch(menuNo) {
			case 1:
				System.out.println("할일 > ");
				String workName = scanner.nextLine();
				System.out.println(" ");
				String title = scanner.nextLine();
				
                Work work = new Work(workName, title);
				
				list.add(work);
				
				
				break;
			case 2:
				for(int i=0; i<list.size(); i++) {
					Work wor = list.get(i);
					System.out.println(wor.getWorkNo() +"  "+ wor.getWorkName() +"  "+ wor.getTitle() +"  "+ (wor.isComplete() ? "완료" : "미완료"));
				}
				
				break;
			case 3:
				while(true) {
					System.out.println("조회할일 선택");
					String name = scanner.nextLine();
					for(int i=0; i<list.size(); i++) {
						Work wor = list.get(i);
						if(name.equals(wor.getWorkName())){
							System.out.println(wor.getWorkNo() +"  "+ wor.getWorkName() +"  "+ wor.getTitle() +"  "+ (wor.isComplete() ? "완료" : "미완료"));
							break;
						}else {
							
						}
								
					}
					break;
				}
				break;
				
				
			case 4:
				System.out.println("완료 할 일을 선택해주세요> ");
				String q = scanner.nextLine();
				for(Work workTemp : list) {
					if(workTemp.getWorkName().equals(q)) {
						if(workTemp.isComplete()) {
							System.out.println("해당할일을 완료처리하였습니다.");
						}else {
							workTemp.setComplete(true);
							System.out.println("해당 할일은 이미 완료되었습니다.");
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
