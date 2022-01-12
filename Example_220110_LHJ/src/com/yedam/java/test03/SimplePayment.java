package com.yedam.java.test03;

public class SimplePayment implements Payment {
	private double ratio;
	
	public SimplePayment(double ratio) {
		this.ratio = ratio;
	}
	
	
	public int online(int price) {
		
		return (int)(price - price*(ratio + Payment.ONLINE_PAYMENT_RATIO));
	}

	
	public int offline(int price) {
		// TODO Auto-generated method stub
		return (int)(price - price*(ratio + Payment.OFFLINE_PAYMENT_RATIO));
	}

	
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : "+ (ratio + Payment.ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제시 총 할인율 : " + (ratio + Payment.OFFLINE_PAYMENT_RATIO));

	}

}
