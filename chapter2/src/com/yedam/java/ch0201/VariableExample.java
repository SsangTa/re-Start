package com.yedam.java.ch0201;

public class VariableExample {

	public static void main(String[] args) {
		//���� ���� -> Ÿ�� �����̸�
		int age;
		double value;
		
		//���� �ʱ�ȭ -> �������� �޸� �Ҵ��� �̷����
		age = 20;
		
		//int result = age + (int)value;
		
		//���� ���
		int hour = 3;
		int minute = 5;
		System.out.print(hour +  "�ð�" + minute + "��");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("��" + totalMinute + "��");
		
		//���� = ����
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ",y: " + y );
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ",y: " + y);
		

	}

}
