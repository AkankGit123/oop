package com.rays.oop;

public class TestAccount {
	
	public static void main(String[] args) {
		Account a = new Account();
		
		a.setAccountType("Current");
		a.setBalance(40000);
		a.setNumber("34567898765");
		
		System.out.println("Type of Account is: " +a.getAccountType());
		System.out.println("Balance in Account is: " + a.getBalance());
		System.out.println("Account Number is: " +a.getNumber());
		a.deposit(20);
		System.out.println("Balance After Deposite in Account is: " + a.getBalance());
		a.withdrawal(50);
		System.out.println("Balance After Withdrawl in Account is: " + a.getBalance());
		a.fundTransferF(300);
		System.out.println("Balance After FundTransfer in Account is: " + a.getBalance());
		
	}
	
	

}
