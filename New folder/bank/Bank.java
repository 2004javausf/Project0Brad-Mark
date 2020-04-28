package com.revature.bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.revature.accounts.Account;
import com.revature.user.Customer;

public class Bank {
	private static ArrayList<Customer> allCustomers;
	private static ArrayList<Account> allAccounts;
	private static final String customerFile="Customers.txt";
	private static final String accountFile="Accounts.txt";
	private static final String accountNumberFile="AccountNumberTracker.txt";
	
	public Bank(){
		
	}
	//201 change to return int, create accNumIncramentor and pass to Account constructor
	//84 find out why edited objects are not visable after being changed
//Customer service methods ----------------------------------------------------------------
	public static ArrayList<Customer> getAllCustomers() {
		allCustomers = pullCustomerList();
		return allCustomers;
	}
	public static Customer getCustomerByUsername(String username) {
		ArrayList<Customer> allCustomersList = getAllCustomers();
		Iterator<Customer> itr = allCustomersList.iterator();
		while(itr.hasNext()) {
			Customer currentCustomer = itr.next();
			if(currentCustomer.getUsername().equals(username)) {
				return currentCustomer;
			}
		}
		System.out.println();
		return null;
	}
	public static void addCustomer(Customer newCustomer) {
		ArrayList<Customer> allCustomersList = getAllCustomers();
		System.out.println("Added customer: " + newCustomer.getUsername()+"\n");
		allCustomersList.add(newCustomer);
		pushCustomerFile(allCustomersList);
	}
	public static void listAllCustomers() {
		ArrayList<Customer> allCustomersList = getAllCustomers();
		Iterator<Customer> itr = allCustomersList.iterator();
		System.out.println("All Customers:");
		while(itr.hasNext()) {
			Customer currentCustomer = itr.next();
			System.out.println("\t"+currentCustomer.getUsername());
		}
		System.out.println();
	}
	public static void removeCustomer(Customer existingCustomer) {
		ArrayList<Customer> allCustomersList = getAllCustomers();
		ListIterator<Customer> itr = allCustomersList.listIterator();
		boolean edited=false;
		try {
			while(itr.hasNext()) {
				Customer currentCustomer = itr.next();
				if(currentCustomer.getUsername().equals(existingCustomer.getUsername())) {
					System.out.println("Removed customer: "+existingCustomer.getUsername()+"\n");
					itr.remove();
					edited = true;
				}
			}
		} catch (Exception e) {
			System.out.println("could not remove customer\n");
		}
		if(edited) {
			pushCustomerFile(allCustomersList);
		} 
	}
	public static void editCustomerInfo(Customer customer, String property, String newValue) {
		ArrayList<Customer> allCustomersList = getAllCustomers();
		ListIterator<Customer> itr = allCustomersList.listIterator();
		String oldUsername = customer.getUsername();
		boolean edited=false;
		try {
			while(itr.hasNext()) {
				Customer currentCustomer = itr.next();
				if(currentCustomer.getUsername().equals(customer.getUsername())) {
					switch(property) {
					case "username":
						currentCustomer.setUsername(newValue);
//						System.out.println("in switch case"+allCustomersList);
						edited = true;
						break;
					case "password":
						currentCustomer.setPassword(newValue);
						edited = true;
						break;
					default:
						break;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Could not edit the information");
		}
		
//		System.out.println(" outside of while loop "+allCustomersList);
		if(edited) {
			System.out.println(oldUsername+"'s "+property+ " has been updated to " + newValue+"\n");
//			System.out.println("in if statement"+allCustomersList);
			pushCustomerFile(allCustomersList);
		}
		
	}
	
//Account service methods ----------------------------------------------------------------
	public static ArrayList<Account> getAllAccounts() {
		allAccounts = pullAccountList();
		return allAccounts;
	}
	public static void listAllAccounts() {
		ArrayList<Account> allAccountsList = getAllAccounts();
		Iterator<Account> itr = allAccountsList.iterator();
		System.out.println("All Accounts:");
		while(itr.hasNext()) {
			Account currentAccount = itr.next();
			System.out.println("\t-"+currentAccount.getAccountStatus()+"- AccountNum: "+currentAccount.getAccountNumber());
		}
		System.out.println();
	}
	public static void addPendingAccount(Account newAccount) {
		ArrayList<Account> allAccounts = getAllAccounts();
		System.out.println("Added account: " + newAccount.getAccountNumber()+"\n");
		allAccounts.add(newAccount);
		pushAccountFile(allAccounts);
	}
	public static void approvePendingAccount(Account pendingAccount) {
		ArrayList<Account> allAccountsList = getAllAccounts();
		ListIterator<Account> itr = allAccountsList.listIterator();
		try {
			while(itr.hasNext()) {
				Account currentAccount = itr.next();
				if(currentAccount.getAccountNumber() == pendingAccount.getAccountNumber()
						&& currentAccount.getAccountStatus()=="Pending") {
					System.out.println("Approved account "+pendingAccount.getAccountNumber()+"\n\tstatus is now 'Active'\n");
					currentAccount.setAccountStatus("Active");
					pushAccountFile(allAccountsList);
				}
			}
		} catch (Exception e) {
			System.out.println("Could not approve this account");
		}
		
		
	}
	public static void removeAccount(Account existingAccount) {
		ArrayList<Account> allAccountsList = getAllAccounts();
		ListIterator<Account> itr = allAccountsList.listIterator();
		try {
			while(itr.hasNext()) {
				Account currentAccount = itr.next();
				if(currentAccount.getAccountNumber() == existingAccount.getAccountNumber()) {
					System.out.println("Removed account "+existingAccount.getAccountNumber()+"\n");
					itr.remove();
					pushAccountFile(allAccountsList);
				}
			}
		} catch (Exception e) {
			System.out.println("Could not remove Account\n");
		}
	}
	
	
	
	
//Bank service methods  ----------------------------------------------------------------
	public static void getNewAccountNumber() {
	}
	public static void pushAccountNumber(String contents) {
		OutputStream os= null;
		File file = new File(accountNumberFile);
		try {
			os= new FileOutputStream(file,false);
			os.write(contents.getBytes());			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(os!=null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public String pullAccountNumber() {
		InputStream is= null;
		File file= new File(accountNumberFile);
		StringBuilder s= new StringBuilder();
		
		try {
			is= new FileInputStream(file);
			int b=0;
			while((b=is.read())!=-1) {
				char c=(char)b;
				s.append(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(is!=null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	return s.toString();
	}
	
	public static void pushCustomerFile(Object modifiedList) {
		try {
			FileOutputStream fileOut = new FileOutputStream(customerFile);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(modifiedList);
			fileOut.close();
			objectOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void pushAccountFile(Object modifiedList) {
		try {
			FileOutputStream fileOut = new FileOutputStream(accountFile);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(modifiedList);
			fileOut.close();
			objectOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Customer> pullCustomerList(){
		ArrayList<Customer> updatedCustomerList = new ArrayList<>();
		try {
			FileInputStream fileIn = new FileInputStream(customerFile);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			updatedCustomerList = (ArrayList<Customer>) objectIn.readObject();
			fileIn.close();
			objectIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return updatedCustomerList;
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Account> pullAccountList(){
		ArrayList<Account> updatedAccountList = new ArrayList<>();
		try {
			FileInputStream fileIn = new FileInputStream(accountFile);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			updatedAccountList = (ArrayList<Account>) objectIn.readObject();
			fileIn.close();
			objectIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return updatedAccountList;
	}

}
