package com.coderscampus.assignment3;

public class UserService {

	public User createUser(String userName, String passWord,String fullName ){
		User user = new User();
		user.setUserName(userName);
		user.setPassWord(passWord);
		user.setFullName(fullName);
		
		
		return user;
	}
		
	

}
