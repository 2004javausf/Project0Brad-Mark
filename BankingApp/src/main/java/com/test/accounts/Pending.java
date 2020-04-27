package com.test.accounts;

import java.util.ArrayList;

import com.test.users.Customer;

public class Pending extends Account{
	private String accountType = "Pending";
	private String status = "Pending";

	public Pending() {
		super();
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pending [accountType=" + accountType + ", status=" + status + ", accountHolder=" + accountHolder
				+ ", balance=" + balance + "]";
	}
	
}
