package com.coderscampus.assignment3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Main 
{

	public static void main(String[] args) throws IOException

	{
		Scanner scanner = new Scanner(System.in);
		BufferedReader fileReader = null;

		int failedAttempts = 0;
			
			

		String line = "";
		
		
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
		} catch (FileNotFoundException e1) {
			System.out.println("file not found");
			e1.printStackTrace();
		}
		
		UserService userService = new UserService();
		User[] users = new User[4];
		for (int i = 0; i < 4; i++) {
			if ((line = fileReader.readLine()) != null) {
				String[] userArray = line.split(",");
				String userName = userArray[0];
				String passWord = userArray[1];
				String fullName = userArray[2];
				users[i] = userService.createUser(userArray[0], userArray[1], userArray[2]);
			}
			
			
			
			while (failedAttempts <5 )
			{
		
		
			System.out.println("what is your email");

			String inputUser = scanner.nextLine();
			System.out.println("what is your password");
			String inputPass = scanner.nextLine();
				
				
				if(inputUser != users[i].getUserName()|| inputPass!= users[i].getPassWord())
				{
					System.out.println("try again");
					failedAttempts++;
					System.out.println("what is your email");
					inputUser = scanner.nextLine();
					System.out.println("what is your password");
					inputPass = scanner.nextLine();
			
					if (inputUser.equals(users[i].getUserName()) && 
							inputPass.equals(users[i].getPassWord())&& failedAttempts <5) 
				{
					System.out.println("welcome " + users[i].getFullName());
					break;
				}
				}
			}
			
		}

		 {
			System.out.println("closing file reader");
		}

	
}
}


