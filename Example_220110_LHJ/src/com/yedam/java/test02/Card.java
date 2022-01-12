package com.yedam.java.test02;

public class Card {
	//필드
	protected String cardNo;
	protected int validDate;
	protected int cvc;
	
	//생성자
	public Card(String cardNo, int validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate= validDate;
		this.cvc =cvc;
	}
    //메서드
	public String getCardNo() {
		return cardNo;
	}

	public int getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}
	
	public void showCardInfo() {
		System.out.printf("카드정보 ( Card No : %s, 유효기간 : %d, CVC : %d\n", cardNo, validDate, cvc);
	}
}
