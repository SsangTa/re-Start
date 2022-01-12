package com.yedam.java.test03;

public interface Payment {
	//필드 - 상수
	public double ONLINE_PAYMENT_RATIO = 5.0;
	public double OFFLINE_PAYMENT_RATIO = 3.0;
	
	//메서드 - 추상메서드
	public int online(int price);
	public int offline(int price);
	public void showInfo();
}
