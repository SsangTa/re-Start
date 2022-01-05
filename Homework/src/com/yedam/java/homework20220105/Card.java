package com.yedam.java.homework20220105;

public class Card {
	
	private static int serialNum = 100;
	
	private int cardNo;
	
	
	public Card() {
		serialNum++;
		cardNo = serialNum;
		
		
	}


	public int getCardNo() {
		return cardNo;
	}


	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
}
