package com.yedam.java.Quiz;

public class Quiz20211228 {

	public static void main(String[] args) {
		// ����1) �Ʒ��� ���� �� ������ �ʱ�ȭ�Ͽ��� �� �� ������ �°� �����ϼ���.
		int x = -5;
		int y = 10;
		int result;
		
		// 1-1) ��ȣ�����ڸ� �̿��Ͽ� ���� x�� ���� ����� ����ϼ���. ��, ���� x�� ���� ������ ���ƾ��Ѵ�.
		int result1 = -x;
		System.out.println("����1-1 : " + result1);
		// 1-2) ���� x�� ���� ������Ų �� ���� y�� ���� ���� ���� ���� y�� ���� ���ҽ�Ű�� ������� ���ٷ� �ۼ��ϼ���.
		int result2 = ++x + y-- ;
		System.out.println("����1-2 : "  + result2);
		// 1-3) ���� x�� y�� ���� ���� ���� 5�� �ǵ��� ���������ڸ� ����Ͽ� ������� ���ٷ� �ۼ��ϼ���.
		int result3 = x + y--;
		System.out.println("����1-3 : " + result3);
		// ����2) �Ʒ��� ���� �� ������ �ʱ�ȭ�Ͽ��� �� ���� ����� ���ʴ�� false �� true�� ����ϵ��� �����ϼ���.
		int m = 10;
		int n = 5;
		
	    System.out.println("����2");
		
		System.out.println(!( m*2 == n*4 ) || !( n<=5 ) );
		
        System.out.println(!( m/2 > 5) && !( n%2 < 1) );
		
		// ����3) �� ������� ���� ������ �ϳ��� ������ ��������� �����ϼ���.
		int val = 0;
		
        System.out.println("����3 ");
		//val = val + 10;
		val += 10;
		System.out.println(val);
		//val = val - 5;
		val -= 5;
		System.out.println(val);
		//val = val * 3;
		val *= 3;
		System.out.println(val);
		//val = val / 5;
		val /= 5;
		System.out.println(val);
		
		// ����4) ���� val�� ���� ����� ��쿣 ���� ����, �ƴ� ��쿣 0�� ��� ������ �����ϼ���. (��, ���׿����ڸ� ���)
		int score = 5;
		String result4 = (score >= 0) ? "5" : "0";
		System.out.println("����4");
		System.out.println(result4);
		/* ���� 5) ������ ���� �� ���� ������ �־����� ��� 
	  			    �� �� �� �߿��� ������ �ִٸ� 'One of a or b is negative number'��,
	  			    ���� �׷��� �ʴٸ� 'both a and b are zero or more'�� ����ϵ��� �����ϼ���. */ 
		int a = 10;
		int b = -8;
		
		System.out.println("����5");
		
		if(a<0) {
			System.out.println("One of a or b is negative number");
		} 
		if(b<0) {
			System.out.println("One of a or b is negative number");
		} 
		

	}

}
