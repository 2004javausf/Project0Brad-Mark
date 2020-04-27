package com.revature.user;

import java.util.ArrayList;

import com.revature.accounts.Account;

public class Customer extends User{
	private static String userType = "Customer";
	private ArrayList<Account> accounts;
	
	public Customer(String username, String password){
		super(username,password);
	}

	public static String getUserType() {
		return userType;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		//todo: retrieve all accounts with username pass in as accounts
		
		return "Customer Username: " +username+
				"\t Password: "+ password+
				"\t Accounts " + accounts +"\n";
	}

}
