package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.Book.Book;
import com.yedam.java.Book.BookDAO;
import com.yedam.java.Book.BookDAOImpl;

public class BookFrame {
	private Scanner scanner = new Scanner(System.in);
	private BookDAO dao = BookDAOImpl.getInstance();

	public BookFrame() {
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int menuNo = menuSelect();
			// 각메뉴별 실행
			if(menuNo == 1) {
				//전체조회
				selectBookList();
			}else if(menuNo == 2) {
				//단건조회
				selectBookInfo();
			}else if(menuNo == 3) {
				//내용검색
				selectsearchBookList();
			}else if(menuNo == 4) {
				//대여가능
				selectrentalBookList();
			}else if(menuNo == 5) {
				//책대여
				rentalBook();
			}else if(menuNo == 6) {
				//책 반납
				returnBook();
			}else if(menuNo == 7) {
				//등록
				insertBookInfo();
			}else if(menuNo == 9) {
				end();
				break;
			}
		}
	}
	
	public void menuPrint() {
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("1.전체조회 | 2.단건조회 | 3.내용검색 | 4.대여가능 | 5.책대여 | 6.책반납 | 7.책등록 | 9.종료");
		System.out.println("============================================================================");
		System.out.println("선택 > ");

	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());

		} catch (Exception e) {
			System.out.println("없는메뉴입니다.");
		}
		return menuNo;
	}
	//전체조회
	public void selectBookList() {
		List<Book>list = dao.selectAll();
		
		for(Book book : list) {
			System.out.println(book);
		}
	}
	//단건조회
	public void selectBookInfo() {
		//책제목 입력
		String bookName = inputBookName();
		
		Book book = dao.selectBook(bookName);
		
		if(book != null) {
			System.out.println(book);
		}else {
			System.out.println("해당 하는 정보가 존재하지 않습니다.");
		}
		
	}
	//내용검색
	public void selectsearchBookList() {
		String keyword = inputBookKeyword();
		
		List<Book>list = dao.selectAll();
		for(Book book : list) {
			if(book.getBookContent().indexOf(keyword) != -1) {
				System.out.println(book);
			}
		}
	}
	
	//대여가능
	public void selectrentalBookList() {
		List<Book>list = dao.selectAll();
		for(Book book : list) {
			if(book.getBookRental() == 0) {
				System.out.println(book);
			}
		}
	}
	
	
	//대여	
	public void rentalBook() {
		//책 제목 입력
		String bookName = inputBookName();
		//해당 책 정보 조회
		Book book = dao.selectBook(bookName);
		//대여 여부 확인
		if(book != null) {
			//대여가 된경우 
			if(book.getBookRental() == 1) {
				System.out.println("해당 책은 대여중 입니다.");
			}else {
				//대여가 안된 경우 대여처리
				book.setBookRental(1);
				dao.update(book);
			}
		}else {
			System.out.println("해당 하는 정보가 존재하지 않습니다.");
		}
	}	
	public void returnBook() {
		//책 제목 입력
		String bookName = inputBookName();
		//해당 책 정보확인
		Book book = dao.selectBook(bookName);
		
		if(book != null) {
			//반납처리
			book.setBookRental(0);
			dao.update(book);
		}else {
			System.out.println("해당 하는 정보가 존재하지 않습니다.");
		}
	}
	

			
	public void insertBookInfo() {
		//책 정보 입력
		Book book = inputBookInfo();
		//책 정보 등록
		dao.insert(book);
	}
	
	public void end() {
		System.out.println("프로그램 종료");
	}
		
	
	
	
	
	public Book inputBookInfo() {
		Book book = new Book();
		System.out.println("책제목>");
		book.setBookName(scanner.nextLine());
		System.out.println("저자명>");
		book.setBookWriter(scanner.nextLine());
		System.out.println("내용>");
		book.setBookContent(scanner.nextLine());
		return book;
		
	}
	
	
	public String inputBookName() {
		System.out.println("책제목>");
		return scanner.nextLine();
	}
	
	public String inputBookKeyword() {
		System.out.println("검색>");
		return scanner.nextLine();
	}
}
