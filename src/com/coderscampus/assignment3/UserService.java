package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
public static String userName;
public static String passWord;
public static String fullName;
public static String line = "";

	public static User createUser(String userName, String passWord, String fullName) {
		User user = new User();
		user.setUserName(userName);
		user.setPassWord(passWord);
		user.setFullName(fullName);

		return user;
	}

	public  User[] getUserDetails() {
		
		
		
		User[] users = new User[4];
		int i = 0;
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
		} catch (FileNotFoundException e1) {
			System.out.println("file not found");
			e1.printStackTrace();
		}
		try {
			while ((line = fileReader.readLine()) != null && i < 4) {
				String[] userArray = line.split(",");
				userName = userArray[0];
				passWord = userArray[1];
				fullName = userArray[2];
				users[i] = createUser(userName, passWord, fullName);
				i++;

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

}
