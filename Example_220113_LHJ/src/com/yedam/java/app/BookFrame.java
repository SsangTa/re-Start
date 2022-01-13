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
			
			if(menuNo == 1) {
				selectAll();
			}else if(menuNo == 2) {
				selectOne();
			}else if(menuNo == 3) {
				searchBook();
			}else if(menuNo == 4) {
				rentalBook();
			}else if(menuNo == 5) {
				borrowBook();
			}else if(menuNo == 6) {
				returnBook();
			}else if(menuNo == 7) {
				insertBook();
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
	
	public void selectAll() {
		List<Book>list = dao.selectAll();
		
		for(Book book : list) {
			System.out.println(book);
		}
	}
	
	public void selectOne() {
		
		Book boo = dao.selectOne(bookName);
		
		if(boo == null) {
			System.out.println("해당책은 존재하지 않습니다.");
		}else {
			System.out.println(boo);
		}
	}
	
	public void searchBook() {
		String word = scanner.next();
		
		if(word == bookName) {
			System.out.println(dao.selectAll()){
				
			}else if(word == bookContent) {
				System.out.println(dao.selectAll()){
					
				}else {
					System.out.println("검색된 책이 없습니다.");
				}
			}
			
		}
				
	}
	
	public void rentalBook() {
		for (Book book : list) {
			if (book.getBookName().equals(name)) {
				if (book.isRental()) {
					System.out.println("해당책은 대여중입니다.");
				} else {
					book.setRental(true);
					System.out.println("대여되었습니다.");
				}
			}
		}
	}
	
	public void borrowBook() {
		
	}
	
	public void returnBook() {
		
	}
	
	public void insertBook() {
		Book boo = inputBookInfo();
		dao.insertBook(boo);
		
	}
	
	public void end() {
		System.out.println("프로그램 종료");
	}
	
	public Book inputBookInfo() {
		Book boo = new Book();
		System.out.println("책제목>");
		boo.setBookName(scanner.nextLine());
		System.out.println("저자명>");
		boo.setBookWriter(scanner.nextLine());
		System.out.println("내용>");
		boo.setBookContent(scanner.nextLine());
		boo.setBookRental(0);
		
		return boo;
		
	}

}
