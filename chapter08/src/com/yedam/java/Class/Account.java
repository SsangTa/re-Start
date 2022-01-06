package com.yedam.java.Class;

public class Account {
	//필드
	private String name;
	private long balance;
	
	
	//생성자
	Account(String name){
		this.name = name;
	}
	
	Account(String name, long balance){
		this.name = name;
		this.balance = balance;
	}

	//메서드
	public String getName() {
		return name;
	}



	public long getBalance() {
		return balance;
	}

	
	//메서드
	public void deposit(long balance) {
		this.balance += balance;
	}
	
	public void withdraw(long balance) {
		this.balance -= balance;
	}
	
	
}
