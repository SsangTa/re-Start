package com.yedam.java.List;

import java.util.ArrayList;
import java.util.List;

public class ArraryListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		list.add("Java");
		
		int size = list.size();
		System.out.println("총 개체 수 : " + size);
		
		String skill = list.get(2);
		System.out.println("2 :" + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println( i + " : " + str);
		}
		
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println( i + " : " + str);
		}
		
	}

}
