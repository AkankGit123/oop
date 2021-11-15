package com.rays.oop;

public class BusinessMan extends Person implements Richman, SocialWorker {

	@Override
	public void helpToOther() {
		System.out.println("Help To Other");
	}

	@Override
	public void earnMoney() {
		System.out.println("Earn Money");

	}

	@Override
	public void donation() {
		System.out.println("Donation");

	}

	@Override
	public void party() {
		System.out.println("Party");
	}

	
	

}
