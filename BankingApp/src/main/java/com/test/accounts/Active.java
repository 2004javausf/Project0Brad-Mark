package com.test.accounts;

import java.util.ArrayList;

import com.test.users.Customer;

public class Active extends Account{
	private String accountType = "Active";
	
	
	public Active(ArrayList<Customer> accountHolder, double balance) {
		super(accountHolder, balance);
	}
	
	//methods
	public void withdraw() {
		
	}
	public void deposit() {
		
	}
	

	@Override
	public String toString() {
		return "Active [accountType=" + accountType + ", accountHolder=" + accountHolder + ", balance=" + balance + "]";
	}
	
}
