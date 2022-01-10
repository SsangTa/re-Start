package com.yedam.java.ch05.wrapper;

public class wrapperExample {

	public static void main(String[] args) {
		//Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.parseInt("200");
		
		//Unboxing
		int value4 = obj4.intValue();
		
		System.out.println(value4);
		
		//자동
		Integer obj = 100;
		
		int value = obj;
		
	//	int result = obj.intValue() + 100;
		int result = obj + 100;

	}

}
