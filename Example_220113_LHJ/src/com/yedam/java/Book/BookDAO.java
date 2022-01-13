package com.yedam.java.Book;

import java.util.List;



public interface BookDAO {
	//전체조회
	public List<Book> selectAll();
	
	//단건조회
	public Book selectOne(String bookName);
	
	//책등록
	public void insert(Book book);
	
	//내용검색
	public void searchBook(Book book);
	
	//대여가능 /책대여 / 책반납
	public void rentalBook(Book book);
	
	
	
	
}
