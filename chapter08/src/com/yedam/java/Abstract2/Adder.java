package com.yedam.java.Abstract2;

public class Adder extends Calculator {

	public Adder () {
		super.run();
	}
	
	@Override
	protected int calc() {
		return a+b;
	}

}
