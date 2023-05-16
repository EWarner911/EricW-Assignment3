package com.coderscampus.assignment3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	UserService getUserInfo = new UserService();

	public static void main(String[] args) throws IOException

	{

		int failedAttempts = 0;

		Scanner scanner = new Scanner(System.in);

		String inputUser;
		String inputPass;

		UserService userService = new UserService();
		User[] newUsers = userService.getUserDetails();

		while (failedAttempts < 5) {
			System.out.println("what is your email");
			inputUser = scanner.nextLine();

			System.out.println("what is your password");
			inputPass = scanner.nextLine();
			boolean loggedIN = false;

			for (int i = 0; i <= 3; i = i + 1) {
				// loop thru users b4 printing outcome
				User myUser = newUsers[i];

				if (inputUser.equalsIgnoreCase(myUser.getUserName())
						&& inputPass.equals(myUser.getPassWord())) {
					System.out.println("logged in " + myUser.getFullName());
					loggedIN = true;
					break;

				}

			}
			if (!loggedIN) {
				failedAttempts++;
			}
			if (loggedIN) {
				break;

			}
			if (failedAttempts >= 5) {
				System.out.println("you are locked out");

			}

		}
	}
}