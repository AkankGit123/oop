package com.rays.oop;

public class AcoountFunded {
	
	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Account a = new Account();
		
		a.setAccountType("Current");
		a.setBalance(3000);
		a.setNumber("67898765");
		
		
		System.out.println("Type of Account is: " +a.getAccountType());
		System.out.println("Balance in Account is: " + a.getBalance());
		System.out.println("Account Number is: " +a.getNumber());
		a.fundTransferT(300);
		System.out.println("Balance in Account After FundReceive is: " + a.getBalance());
		
	}
	
	
	

}
