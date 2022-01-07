package com.yedam.java.LifoFifo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		List<Product> list = new ArrayList<Product>();
		
		
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.상품 및 가격입력 | 2.제품별 가격 | 3.분석 | 4.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택 : ");
			int menuNo = scanner.nextInt();

			switch (menuNo) {
			case 1:
				
				System.out.println("상품명 입력 : ");
				String name = scanner.next();
				System.out.println("가격 입력 : ");
				int price = scanner.nextInt();
				
				Product product = new Product(name, price);
				list.add(product);

				break;
			case 2:
				for (int i = 0; i < list.size(); i++) {
					Product pro = list.get(i);
					System.out.println(pro.getName() + " : " + pro.getPrice());
				}
				break;
			case 3:
				int max = 0;
				for(Product pro : list) {
					if(max < pro.getPrice()) {
						max = pro.getPrice();
					}
				}
				
				String productName = null;
				int productTotal = 0;
				for(int i=0; i<list.size(); i++) {
					Product pro = list.get(i);
					if(pro.getPrice() == max) {
						productName = pro.getName();
						continue;
					}
					productTotal += pro.getPrice();
				}
				
				System.out.println(" 최고 가격을 가진 제품은 " + productName + " 입니다. ");
				System.out.println(" 최고 가격을 제외한 총합은 " + productTotal + " 입니다. ");
				break;
			case 4:
				run = false;
				System.out.print("프로그램 종료");
				break;
			}

		}
	}

}
