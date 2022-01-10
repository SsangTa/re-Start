package com.yedam.java.homework20220107;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example_Library {

	public static void main(String[] args) {boolean run = true;
	Scanner scanner = new Scanner(System.in);
	List<Book> list = new ArrayList<>();
	int menNo;

	while (run) {
		System.out.println("-------------------------------------------------------------");
		System.out.println("1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료");
		System.out.println("-------------------------------------------------------------");
		System.out.println("선택 : ");
		int menuNo = Integer.parseInt(scanner.nextLine());

		switch (menuNo) {
		case 1:

			System.out.println("책이름을 입력 하세요. ");
			String bookName = scanner.nextLine();
			System.out.println("책저자를 입력 하세요. ");
			String author = scanner.nextLine();

			Book book = new Book(bookName, author);
			
			list.add(book);

			break;
		case 2:
			library.printBookList();
			
			
			
			break;
		case 3:
			
			while(true) {
				System.out.println("조회할 책이름을 입력 하세요.");
				String name = scanner.nextLine();
				for(int i=0; i<list.size(); i++) {
					Book boo = list.get(i);
					if(name.equals(boo.getBookName())){
						System.out.println("책번호 : " + boo.getBookNum() + " 책이름 : " + boo.getBookName() + " 저자명 : " + boo.getAuthor() + " 대여 여부 : " + (boo.isRental() ? "대여중" : "대여가능"));
						break;
					}else {
						
					}
							
				}
				break;
			}
			break;
		case 4:
		//	System.out.println("대여할 도서명 : ");
		//	String q = scanner.nextLine();
		//	for(int i=0; i<list.size(); i++) {
		//		Book num1 = list.get(i);
		//		if(num1.getBookName().equals(q)) {
		//			if(num1.isRental() == true) {
		//				num1.setRental(false);
		//				System.out.println(" 대여되었습니다. ");
		//			}else {
		//				System.out.println(" 대여중입니다. ");
		//			}
		//		}
		//	}
			System.out.println("대여할 도서명 : ");
			String q = scanner.nextLine();
			for(Book bookTemp : list) {
				if(bookTemp.getBookName().equals(q)) {
					if(bookTemp.isRental()) {
						System.out.println("해당책은 대여중입니다.");
					}else {
						bookTemp.setRental(true);
						System.out.println("대여되었습니다.");
					}
				}
			}
			
			break;
		case 5:
			System.out.println("반납할 도서명 : ");
			String w = scanner.next();
			for(int i=0; i<list.size(); i++) {
				Book num1 = list.get(i);
				if(num1.getBookName().equals(w)) {
					if(num1.isRental() == true) {
						num1.setRental(false);
						System.out.println(" 반납되었습니다. ");
					}
				}
			}
			
		//	for(Book bookTemp : list) {
		//		if(bookTemp.getBookName().equals(w)) {
		//			if(bookTemp.isRental(false);
		//			System.out.println("반납되었습니다.");
		//		}
		//	}
				
			break;
		case 6:
			run = false;
			System.out.println("=== 프로그램 종료 ===");
			break;
		}

	}

}// TODO Auto-generated method stub

	

}
