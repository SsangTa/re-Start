package com.yedam.java.homework20220107;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MainExample {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// 문제) 다음은 도서관리프로그램 중 일부입니다.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료
		// 2) 입력되는 책정보는 책이름과 저자명입니다.
		// 3) 전체 조회 및 단건 조회 시 책번호, 책이름, 저자명, 해당 책의 대여여부(대여중, 대여가능)도 함께 출력되도록 하세요.
		// 4) 책 대여 시 해당 책의 대여여부를 확인해서
		// 이미 대여 중인 책일 경우 "대여 중입니다."라는 안내문구를 출력하고
		// 대여가 가능한 책일 경우 대여처리 후 "대여되었습니다"라고 출력하도록 하세요.
		// 5) 책 반납 시 반납처리 후 "반납되었습니다."라고 출력하도록 하세요.
		// 6) 종료시 "프로그램 종료"를 출력하도록 하세요.

		/*
		 * 중앙로 도서관에서 근무 중인 김씨의 오늘 업무일지는 다음과 같습니다. - 당일 들어온 책에 대해 입고처리 (참고, 책마다 고유번호가
		 * 자동으로 부여됩니다. ) 1) 혼자공부하는자바, 신용권 2) 이것이자바다, 신용권 3) 자바스크립트파워북, 에이포스트 4)
		 * 나는프로그래머다, 이상순 5) 오늘부터개발자, 김용닥 6) SQL의 비밀노트, 김예담 - 현재 보유 중인 책 목록 확인 - 이용자가 요청한
		 * 책 정보 확인 1) 이것이자바다 2) 오늘부터개발자 - 책 대여 1) 나는프로그래머다 -> 정상대여 2) 혼자공부하는자바 -> 정상대여
		 * 3) 나는프로그래머다 -> 대여 중 - 책 반납 1) 혼자공부하는자바
		 */

		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		List<Book> list = new ArrayList<Book>();
		int menNo;

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료");
			System.out.println("-------------------------------------------------------------");
			System.out.println("선택 : ");
			int menuNo = scanner.nextInt();

			switch (menuNo) {
			case 1:

				System.out.println("책이름을 입력 하세요. ");
				String bookName = scanner.next();
				System.out.println("책저자를 입력 하세요. ");
				String author = scanner.next();

				Book book = new Book(bookName, author);
				
				list.add(book);

				break;
			case 2:
				for(int i=0; i<list.size(); i++) {
					Book boo = list.get(i);
					System.out.println("책번호 : " + boo.getBookNum() + " 책이름 : " + boo.getBookName() + " 저자명 : " + boo.getAuthor() + " 대여 여부 : " );
				}
				break;
			case 3:
				
				while(true) {
					System.out.println("조회할 책이름을 입력 하세요.");
					String name = scanner.next();
					for(int i=0; i<list.size(); i++) {
						Book boo = list.get(i);
						if(name.equals(boo.getBookName())){
							System.out.println("책번호 : " + boo.getBookNum() + " 책이름 : " + boo.getBookName() + " 저자명 : " + boo.getAuthor() + " 대여 여부 : ");
							break;
						}else {
							
						}
								
					}
					break;
				}
				break;
			case 4:
				System.out.println("대여할 도서명 : ");
				String q = scanner.next();
				for(int i=0; i<list.size(); i++) {
					Book num1 = list.get(i);
					if(num1.getBookName().equals(q)) {
						if(num1.isRental() == true) {
							num1.setRental(false);
							System.out.println(" 대여되었습니다. ");
						}else {
							System.out.println(" 대여중입니다. ");
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
				
				break;
			case 6:
				run = false;
				System.out.println("프로그램 종료 ");
				break;
			}

		}

	}

}
