package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		//���� ���ͷ�
		int var1 = 0b1011;  //2����
		int var2 = 0206;    //8����
		int var3 = 0xB3;    //16����
		int var4 = 365;     //10����
		
		System.out.println("var1" + var1);
		System.out.println("var2" + var2);
		System.out.println("var3" + var3);
		System.out.println("var4" + var4);
		
		//byte Ÿ��
		byte v1 = -128;
		byte v2 = -30;
		byte v3 = 0;
		byte v4 = 30;
		byte v5 = 127;
		//byte v6 = 128;
		
		//long Ÿ��
		long var10 = 20;
		long var11 = 10000000000000000L;
		
		//char Ÿ��
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u004a';
		char c4 = '��';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		//String Ÿ��
		String name = "ȫ�浿";
		String job = "���α׷���";
		System.out.println(name);
		System.out.println(job);
		
		System.out.println("��ȣ\t�̸�\t����");
		System.out.println("�츮�� \"������\" �Դϴ�.");
		System.out.println("��\\����\\����\\�ܿ�");
		
		//�Ǽ�Ÿ��
		float f1 = 3.14F;
		double d1 = 3.14;
		
		float varF = 0.1234567890123456789F;
		double varD = 0.1234567890123456789;
		
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
		System.out.println("varF : " + varF);
		System.out.println("varD : " + varD);
		
		//��Ÿ��
		
		boolean stop = true;
		if(stop) {
			System.out.println("�����մϴ�.");
		}else {
			System.out.println("�����մϴ�.");
			
		}
		
		
		//����1
		int a = 10, b = 50, c = 90;
		
		System.out.println("a: " + a + ",b: " + b +",c:" + c );
		
		int temp = a;
		a=b;
		b=c;
		c= temp;
		System.out.println("a: " + a + ",b: " + b +",c:" + c );
		
	}

}
