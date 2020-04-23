package com.test.menu;

import java.util.Scanner;

import com.test.bank.Bank;

public class Menu {
	Scanner keyboard;
	Bank bank;
	
	public Menu(Scanner keyboard, Bank bank) {
		super();
		this.keyboard = keyboard;
		this.bank = bank;
	}
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	public void runMenu() {
		
	}
}
