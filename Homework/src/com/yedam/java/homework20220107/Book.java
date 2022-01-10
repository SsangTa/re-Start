package com.yedam.java.homework20220107;

public class Book {
	//필드
	private static int serialNum = 100;
	
	private int bookNum;
	
	
	private String bookName;
	private String author;
	private boolean rental;
	
	//생성자
	
	
	public Book(String bookName, String author) {
		serialNum++;
		this.bookNum = serialNum;
		this.bookName = bookName; 
		this.author = author;
		this.rental = false;
		
		
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isRental() {
		return rental;
	}

	public void setRental(boolean rental) {
		
		this.rental = rental;
	}

	
	


}
