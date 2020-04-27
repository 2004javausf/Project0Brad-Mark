package com.revature.accounts;

import java.util.ArrayList;

import com.revature.user.Customer;


public class Account {
	private double balance;
	private ArrayList<Customer> accountHolder;
	private int accountNumber;
	private static int numberOfAccounts = 1000;
	
	public Account(double initialDeposit, ArrayList<Customer> accountHolder){
		this.accountNumber = numberOfAccounts++;
		this.balance = initialDeposit;
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public ArrayList<Customer> getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(ArrayList<Customer> accountHolder) {
		this.accountHolder = accountHolder;
	}

	@Override
	public String toString() {
		String accountHolderNames = "";
		for(Customer i: accountHolder) {
			accountHolderNames += i.getUsername() +" ";
		}
		
		return "Account Number: "+accountNumber+"\tHolder(s): " +accountHolderNames+
				"\t balance: "+ balance;
	}

	
	
	
	
}
