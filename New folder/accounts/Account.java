package com.revature.accounts;

import java.io.Serializable;
import java.util.ArrayList;

import com.revature.user.Customer;


public class Account implements Serializable{
	private static final long serialVersionUID = -576684925217400380L;
	private double balance;
	private String accountStatus;
	private String accountType;
	private ArrayList<Customer> accountHolder;
//TODO: pesrsist account numbering
	private int accountNumber;
	private static int numberOfAccounts = 1000;
	
	public Account(double initialDeposit, ArrayList<Customer> accountHolder){
		this.accountStatus = "Pending";
		this.balance = initialDeposit;
		this.accountHolder = accountHolder;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
//AccountType if we want to differentiate between checking and saving
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
				"\t balance: "+ balance +"\n";
	}

	
	
	
	
}
