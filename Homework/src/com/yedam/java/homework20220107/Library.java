package com.yedam.java.homework20220107;

import java.util.List;

public class Library {
	//필드
	private List<Book> list;
	
	
	//생성자
	public Library() {
		list = new ArrayList<Book>();
	}
	
	
	//메서드
	
	//책정보 입력
	public void addBook(String bookname, String author) {
		list.add(new Book(bookname,author));
	}
	
	
	//책정보 전체출력
	public void printBookList() {
		for(Book book : list) {
			System.out.println("책번호 : " + boo.getBookNum() + " 책이름 : " + boo.getBookName() + " 저자명 : " + boo.getAuthor() + " 대여 여부 : "  + (boo.isRental() ? "대여중" : "대여가능"));
		}
	}
	
	
	//책정보 단건출력
	public void selectBookInfo(String name) {
		for(Book book : list) {
			if(book.getBookName().equals(name)) {
				
			}
		}
	}
	
	
	//책 대여
	public void rantalBook(String name) {
		for(Book book : list) {
			if(book.getBookName().equals(name)) {
				if(book.isRental()) {
					System.out.println("해당책은 대여중입니다.");
				}else {
					book.setRental(true);
					System.out.println("대여되었습니다.");
				}
		}
	}
	
	//책 반납
		public void retrunBook(String name) {
			for(Book book : list) {
				if(book.getBookName().equals(name)) {
					book.setRental(false);
				}
			}
		}
	
	
	
}
