package com.yedam.java.homework20220105;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		return instance;
	}
	
	public Card createCard() {
		return new Card();
	}

}
