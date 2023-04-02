package com.coderscampus.assignment3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Assignment3 
{
	

	public static void main(String[] args)
	{	int counter = 0;
		BufferedReader fileReader = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your user name");
		String userName = scanner.nextLine();
		
		try {
			
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line;
			while(counter <=4)
			{
				
			if(userName.length() >1)
			{
				
			
			while ((line = fileReader.readLine()) != null ) 
			{
				String[] lineArray = line.split(",");
				
			
				for (String createdUsers : lineArray) 
				{	
					if(userName.equals(lineArray[0]))
					{
						System.out.println("what is your password");
						String password = scanner.nextLine();
						if(password.equals(lineArray[1]))
						{
							System.out.println("you logged in " +lineArray[2]);
							
						}else
						{
							System.out.println("invalid user name");
							counter++;
							System.out.println("number of failed log in " +counter);
						}
						
						
					}
				}
			}
			}
			}
			
			
		} catch(IOException e) 
			{
				e.printStackTrace();
			} 
		finally 
			{
			System.out.println("closing file reader");
			try 
			{
				fileReader.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("end of app");
	}

}
