package com.rays.oop;

public abstract class TestShapeInherit extends CShapeInherit{	

	public static void main(String[] args) {
		
		/*
		 * CShapeInherit s = new Circle(5);
		 * 
		 * System.out.println("area of circle is: " + s.area());
		 * 
		 * CShapeInherit s1 = new Ractangle(23, 12);
		 * System.out.println("area of Ractangle is: " + s1.area());
		 * 
		 * CShapeInherit s2 = new Triangle(3, 2);
		 * System.out.println("area of Triangle is: " + s2.area());
		 */		
		
		CShapeInherit[] s = new CShapeInherit[3];
		s[0] = new Circle(5);
		s[1] = new Ractangle(3,1);
		s[2] = new Triangle(4,6);
		
		double totalArea = calcArea(s);
		System.out.println("Ractangle area is" +s[0].area());
		System.out.println("circle area is" +s[1].area());
		System.out.println("Triangle area is" +s[2].area());
		
	}

	private static double calcArea(CShapeInherit[] s) {
		double totalArea = 0;
		for(int i = 0; i<s.length; i++) {
		
			//	totalArea += s[i].area();
			totalArea = totalArea + s[i].area();
		}
		return totalArea;
	}

}
