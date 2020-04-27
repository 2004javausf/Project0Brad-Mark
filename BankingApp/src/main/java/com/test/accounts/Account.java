package com.test.accounts;

import java.util.ArrayList;

import com.test.users.Customer;

public class Account {
	protected ArrayList<Customer> accountHolder;
	protected double balance =0;
	private int accNumber = 0;
	private static int num = 1230030; // allows us to set an account number
	
	
	
	
	
	

	public Account() {
		super();
		accNumber = num++;
	}







	public double getBalance() {
		return balance;
	}







	public void setBalance(double balance) {
		this.balance = balance;
	}







	public int getAccNumber() {
		return accNumber;
	}

	
	

}
