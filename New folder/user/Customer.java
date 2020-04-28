package com.revature.user;

import java.io.Serializable;
import java.util.ArrayList;

import com.revature.accounts.Account;

public class Customer implements Serializable{

	private static final long serialVersionUID = -4681026638434820379L;
	private static String userType = "Customer";
	private String username;
	private String password;
	private ArrayList<Account> accounts;
	

	public Customer(String username, String password){
		this.username = username;
		this.password = password;
	}

	public static String getUserType() {
		return userType;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
