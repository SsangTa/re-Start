package com.yedam.java.Example3;

public class Car {
	//필드
	
	private static int serialNum = 1000;
	
	private int carNumber;
	
	
	
	//생성자
	public Car() {
		serialNum++;
		carNumber = serialNum;
	}
	
	//메서드



	public static int getSerialNum() {
		return serialNum;
	}



	public static void setSerialNum(int serialNum) {
		Car.serialNum = serialNum;
	}



	public int getCarNumber() {
		return carNumber;
	}



	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	

	
	
	
	
	
	
	
	
	

}
