package com.yedam.java.test02;

public class Card {
	protected int cardNo;
	private int validDate;
	private int CVC;
	
	
	public Card(int cardNo, int validDate, int CVC) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.CVC = CVC;
		
	}


	public void Card(int cardNo2, int valiDate, int cVC2) {
		// TODO Auto-generated constructor stub
	}


	public int getCardNo() {
		return cardNo;
	}


	public int getValidDate() {
		return validDate;
	}


	public int getCVC() {
		return CVC;
	}
	
	
	public void showCardinfo() {
		System.out.println("Cadr No : "+ cardNo + ", 유효기간 : " + validDate + ", CVC : " + CVC);
	}
}
