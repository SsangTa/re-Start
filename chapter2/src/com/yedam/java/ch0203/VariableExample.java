package com.yedam.java.ch0203;

public class VariableExample {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ : ���� ��ȿ���� � -> ��
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:" + intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�:" + intValue);
		
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
		//���� Ÿ�� ��ȯ
		intValue = 44032;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		longValue =500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		//���� Ÿ���� ����
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
		
		//�Ǽ� Ÿ���� ����
		int intV1 =10;
		double doubleV1 = 5.5;
		double resultValue = intV1 + doubleV1;
		System.out.print(resultValue);
		
		System.out.println();
		//����Ŀ��� �ڵ� Ÿ�Ժ�ȯ
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int resultValue1 = byteValue1 + byteValue2;
		System.out.println(resultValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int resultValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ� : " + resultValue2);
		System.out.println("��¹��� : " + (char)resultValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		double doubleValue1 = intValue3/4.0;
		System.out.println(doubleValue1);
		
		int x1 = 1;
		int y1 = 2;
		double result1 = x1/y1;
		System.out.println(result1);
		// 1(int)/2(int) = 0.5 �ǰ�� / int�� �Ҽ��� �Ʒ��� ������. �� 0.5 > 0.0
		
		result1 = (double)x1 / y1;
		System.out.println(result1);
		// 1.0(����) / 2(�Ǽ�) > �Ǽ����� �����̱� ������ ���� �Ǽ��� �ٲ� 1.0(�Ǽ�)/2.0(�Ǽ�) =0.5 �� �����
		
		// ���ڿ� ����
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
