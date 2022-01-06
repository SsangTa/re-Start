package com.yedam.java.Abstract3;

public class Won2Dollar extends Converter {
	private int money;
	
	
	public Won2Dollar(int money) {
		this.money = money;
	}
	
	

	@Override
	protected double convert(double src) {
		return src/money;
	}

	@Override
	protected String getSrcString() {
		
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}
