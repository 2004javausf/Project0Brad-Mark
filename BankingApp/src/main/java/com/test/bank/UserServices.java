package com.test.bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.test.accounts.Account;
import com.test.users.CustomerOne;

public class UserServices extends BankServices {
	private static final String fileLocation = "Users.txt";
	private static List<CustomerOne> workingList = new ArrayList<>();
	
	public static String getFileLocation() {
		return fileLocation;
	}

	public static List<CustomerOne> getWorkingList() {
		return workingList;
	}

	public static void writeFileContents(CustomerOne u) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(fileLocation,true));
			objectOut.writeObject(workingList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static void readFileContents() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(fileLocation));
			workingList = (List<CustomerOne>) objectIn.readObject();
			objectIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
