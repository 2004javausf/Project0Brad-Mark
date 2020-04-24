package com.test.menu;

import java.util.Scanner;

import com.test.bank.Bank;

public class Menu {
	Scanner sc = new Scanner(System.in);
	Bank bank;
	boolean exit;
	
	public static void main(String[] args) {
		Menu m = new Menu();
		m.runMenu();
	}
	
	
	
	public void runMenu() {
		while (!exit) {
			printMenu();
			int option = userInput();
			optionSelect(option);
		}
	}



	private void printMenu() {
		System.out.println("Do you have an account with us?");
		System.out.println("For Yes press 1");
		System.out.println("For No press 2");
	}


	private int userInput() {
		int option = 2000;
		int i = 0;
		do {
		try {
			option = Integer.parseInt(sc.nextLine());
		}
		catch(Exception e) {
			i++;
			if(i>2) {
				System.out.println("Press. An. Integer.");
			}
		}
		if(1>option||option>2) {
			System.out.println("Please enter one of the two options. 1 for Yes or 2 for No");
		}
		
	}while ((1>option||option>2));
		return option;
	}
			private void optionSelect(int option) {
					switch (option) {
					case 1: 
						logIn();
						break;
					case 2:
						while(!exit) {
							askMakeAccount();
							int option2 = userinput2();
							optionSelect2(option2);
						}
					default:
						System.out.println("how?");
						break;
		}
	
	}

			
			
			private void logIn() {
				System.out.print("Please enter your username: ");
				String username = sc.nextLine();
				// if(username exists in our data base)
				System.out.println("Your username is: "+username);
				// else print out invalid username. and also have an escape option
				System.out.print("Please enter your password: ");
				String password = sc.nextLine();
				for(int i = 0;i<=3;i++) {
					// if password is correct go to Account menu.
					// else print out "The password you entered was incorrect. Try again.
					System.out.println("The password you entered was incorrect. Try again.");
					password = sc.nextLine();
					// if password is correct go to account menu.
					if (i == 3) {
						System.out.println("The account is locked.");
						System.exit(0);
						break;
					}
				}
			}

			
			
			
			
			
			


					private void askMakeAccount() {
							System.out.println("Would you like to have an account with us?");
							System.out.println("For yes press 1");
							System.out.println("For no press 2");

}
					private int userinput2() {
						int option2 = 2000;
						int i2 = 0;
						do {
						try {
							option2 = Integer.parseInt(sc.nextLine());
						}
						catch(Exception e) {
							i2++;
							if(i2>2) {
								System.out.println("You know the drill.");
							}
						}
						if(1>option2||option2>2) {
							System.out.println("Please enter one of the two options. 1 for yes or 2 for no");
						}}while ((1>option2||option2>2));
						return option2;
			}
					
					private void optionSelect2(int option2) {
						if (option2 == 2) {
						System.out.println("Thank you have a good day.");
						System.exit(0);
						}
						else {
							createAccount();
						}
							
			}



					private void createAccount() {
						int i = 0;
						
						
							System.out.println("Please enter your preferred username: ");
							String username = sc.nextLine();
							//if the username is in our list make a statement saying it is a taken username
							System.out.println("Your username is: "+username);
							
							while(!exit) {
								i++;
								
							System.out.println("Please enter your password: ");
							String password = sc.nextLine();
							
							System.out.println("Please re-enter your password: ");
							String test = sc.nextLine();
							if(test.equals(password)) {
								System.out.println("Passwords match.");
								//take them to accounts to enter in more info or something i dnno
								System.exit(0);
							}
							else {
								if (i>3) {
									System.out.println("Your passwords still do not match, program ending.");
									System.exit(0);
								}
								System.out.println("Passwords do not match. Please try again.");
								
							}
							}
					}
					
					
					
					
					
					

					
	}
