package com.yedam.java.ch02_02;

public class Kumho extends Tire {

	public Kumho(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	@Override
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation - accumulateRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}

}
