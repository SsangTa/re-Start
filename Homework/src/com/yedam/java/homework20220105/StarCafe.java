package com.yedam.java.homework20220105;

public class StarCafe {
	
	private String cafeName;	
	private int money;
	private int passengerCount;
	
	
	
	public StarCafe(String cafeName) {
		this.cafeName = cafeName;
	}
	
	public void buy(int money) {
		this.money += money;
		this.passengerCount++;
			
	}
	
	public void showInfo() {
		System.out.println(cafeName +" 고객수 : " + passengerCount + "명, 수입 : " + money);
	} 

}
