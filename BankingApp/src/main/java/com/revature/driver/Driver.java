package com.revature.driver;

import java.util.ArrayList;

import com.revature.accounts.Account;
import com.revature.bank.Bank;
import com.revature.menu.AdminMenu;
import com.revature.menu.CustomerMenu;
import com.revature.menu.EmployeeMenu;
import com.revature.services.AccountServices;
import com.revature.services.BankServices;
import com.revature.services.CustomerServices;
import com.revature.users.Customer;

public class Driver {

	public static void main(String[] args) {
		//Create bank object and pull all bank info from documents
		Bank bank = new Bank();
		bank.pullAllBankInfo();
		//CustomerMenu c = new CustomerMenu("Brad", "Mark");
		//c.accountMenu();
		CustomerServices.listAllCustomers();
		AccountServices.listAllAccounts();
//		System.out.println(AccountServices.getAccount(1000));
//		AccountServices.addToAccount(1000, CustomerServices.getCustomer("Brad"));
//		System.out.println(AccountServices.getAccount(1000));
//		AccountServices.changePendingAccount(AccountServices.getAccount(1000), true);
//		AccountServices.checkPendingAccount();
		EmployeeMenu.runEmployeeMenu();
//		//example customer
//		Customer exampleCustomer = new Customer("Brad","Mark");
		
//		System.out.println(exampleCustomer);
		//example account
//		ArrayList<Customer> accountHolders = new ArrayList<>();
//		accountHolders.add(exampleCustomer);
//		double initialBalance = 1000000.00;
//		Account exampleAccount = new Account(initialBalance, accountHolders);
		
//		BankServices.withdraw(AccountServices.getAccount(1000), 10);
//		BankServices.deposit(AccountServices.getAccount(1000), 20);
//		System.out.println(exampleAccount.getBalance());	
//		BankServices.transfer(AccountServices.getAccount(1002), AccountServices.getAccount(1001), 100);
		
//		CustomerServices.addCustomer(exampleCustomer);
//		AccountServices.addPendingAccount(exampleAccount);
//		bank.pullAllBankInfo();
//		System.out.println(CustomerServices.getCustomer("customerName"));
	}

}