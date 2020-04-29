package com.test.bank;

public class BankServices {
	
	public void withdraw(double Balance, double Withdrawl) {
		Balance = Balance - Withdrawl;
		System.out.println(Balance);
	}

	public void deposit(double Balance, double Deposit) {
		Balance = Balance - Deposit;
		System.out.println(Balance);
	}
}