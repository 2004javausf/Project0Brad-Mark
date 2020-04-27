package com.test.accounts;

import java.io.Serializable;
import java.util.ArrayList;

import com.test.users.Customer;

public class Account implements Serializable{
	
	private static final long serialVersionUID = 5781749031878828104L;
	protected ArrayList<Customer> accountHolder;
	protected double balance =0;
	
	public Account(ArrayList<Customer> accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public ArrayList<Customer> getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(ArrayList<Customer> accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
