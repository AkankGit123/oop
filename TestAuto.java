package com.rays.oop;

public class TestAuto {
	
	public static void main(String[] args) {
		Automobile a = new Automobile();
		a.setColor("Pink");
		a.setMake("I20");
		a.setSpeed(20);
		System.out.println("Color of Vehicle is: " +a.getColor());
		System.out.println("Make (Model Name) is: " + a.getMake());
		System.out.println("Speed now is: " +a.getSpeed());
		a.Break(10);
		System.out.println("Speed after applying break is: " +a.getSpeed());
		
	}
	
}
