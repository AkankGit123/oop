package com.rays.oop;

public class TestAbstractClass {

	public static void main(String[] args) {

	// AbsAbstract ab = new AbsAbstract();   //can't insantiate AbsAbstract
    //have to override incomplete or abstract area()
		AbsAbstract ab = new AbsAbstract() {
			
			@Override
			public double area() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}
