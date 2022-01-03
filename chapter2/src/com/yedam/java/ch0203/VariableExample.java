package com.yedam.java.ch0203;

public class VariableExample {

	public static void main(String[] args) {
		// 자동 타입 변환 : 값의 유효범위 小 -> 大
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:" + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드:" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue:" + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue:" + doubleValue);
		
		System.out.println();
		//강제 타입 변환
		intValue = 44032;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		longValue =500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		//정수 타입의 연산
		byte result = 10 + 20;
		System.out.println(result);
		byte x = 10;
		byte y = 20;
		//byte result1 x + y;
		int result2 = x + y;
		System.out.println(result);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		long result3 = value1 + value2 + value3;
		System.out.println(result3);
		
		//실수 타입의 연산
		int intV1 =10;
		double doubleV1 = 5.5;
		double resultValue = intV1 + doubleV1;
		System.out.print(resultValue);
		
		System.out.println();
		//연산식에서 자동 타입변환
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int resultValue1 = byteValue1 + byteValue2;
		System.out.println(resultValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int resultValue2 = charValue1 + charValue2;
		System.out.println("유니코드 : " + resultValue2);
		System.out.println("출력문자 : " + (char)resultValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		double doubleValue1 = intValue3/4.0;
		System.out.println(doubleValue1);
		
		int x1 = 1;
		int y1 = 2;
		double result1 = x1/y1;
		System.out.println(result1);
		// 1(int)/2(int) = 0.5 의결과 / int는 소수점 아래는 버린다. 즉 0.5 > 0.0
		
		result1 = (double)x1 / y1;
		System.out.println(result1);
		// 1.0(정수) / 2(실수) > 실수끼리 연산이기 때문에 전부 실수로 바뀜 1.0(실수)/2.0(실수) =0.5 가 도출됨
		
		// 문자열 결합
		int value = 10 + 2 +8;     //20
		System.out.println(value);
		
		String str1 = 10 + 2 + "8"; //128
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8; //1028
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8; //1028
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8); //1010
		System.out.println(str4);

	}

}
