package com.test.bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.test.users.Customer;

public class UserServices extends BankServices {
	private static final String fileLocation = "Users.txt";
	private static List<Customer> workingList = new ArrayList<>();
	
	
}
