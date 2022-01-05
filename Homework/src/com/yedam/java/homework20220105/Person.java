package com.yedam.java.homework20220105;

public class Person {
	
	public String name;
	public int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyCoffee(BeanCafe beanCafe) {
		this.money -= 4500;
		beanCafe.buy(4500);
	}
	
	public void buyCoffee(StarCafe starCafe) {
		this.money -= 4000;
		starCafe.buy(4000);
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "입니다.");
	}

}
