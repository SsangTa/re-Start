package com.yedam.java.test03;

public class CardPayment implements Payment {
	private double cardRatio;
	
	
	
	public CardPayment(double card) {
		this.cardRatio = card;
	}
	
	
	public int online(int price) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int offline(int price) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void showInfo() {
		System.out.println("*** 카드로 결제시 할인정보");
	    System.out.println("온라인 결제시 총 할인율 : " + CardPayment.ONLINE_PAYMENT_RATIO);
	    System.out.println("오프라인 결제시 총 할인율 : " + CardPayment.OFFLINE_PAYMENT_RATIO);

	}

}
