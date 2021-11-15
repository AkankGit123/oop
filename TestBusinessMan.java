package com.rays.oop;

public class TestBusinessMan extends BusinessMan  {
	
	public static void main(String[] args) {
		
		
		BusinessMan bS = new BusinessMan();
		bS.donation();
		bS.earnMoney();
		bS.party();
		bS.helpToOther();
		bS.setAddress("234, dekdkfkf, kfjfjf");
		bS.setName("Vijay");
		
		System.out.println("Address :" + bS.getAddress());
		System.out.println("Name :" + bS.getName());
		
		
		
		
	}
	

}
