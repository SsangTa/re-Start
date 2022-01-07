package com.yedam.java.Abstract2;

public class Subtracter extends Calculator {
	
	public Subtracter () {
		super.run();
	}
	
	
	@Override
	protected int calc() {
		return a-b;
	}

}
