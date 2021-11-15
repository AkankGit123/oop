package com.rays.oop;

public class BankAccountCloning implements Cloneable {
	
	public double balance = 0;
	
	public BankAccountCloning(double b) {
		balance = b;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
	BankAccountCloning a1 = new BankAccountCloning(100);
	BankAccountCloning a2 = (BankAccountCloning) a1.clone();

	System.out.println(a1.balance);
	System.out.println(a2.balance);
}}
