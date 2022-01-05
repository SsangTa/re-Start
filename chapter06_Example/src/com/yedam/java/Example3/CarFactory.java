package com.yedam.java.Example3;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Car createCar() {
		return new Car();
	}

}
