package com.rays.oop;

public class TestAddition {
	
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(2, 2.3f);
		System.out.println(a.add(2, 2.3f));
		a.add(3, 3);
		a.add(4, 3.9f, 4.2f);
		System.out.println(a.add(4, 3.9f, 4.2f));
		a.add(1, 2, 2, 4);
	}

}
