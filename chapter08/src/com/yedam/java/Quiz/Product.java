package com.yedam.java.Quiz;

public class Product {
	//filed
	private String name;
	private int price;
	//use
	public Product (String name, int price) {
		this.name = name;
		this.price = price;
	}
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
