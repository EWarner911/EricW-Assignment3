package com.coderscampus.assignment3;

public class User 
{
	private String userName;
	private String passWord;
	private String fullName;
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", fullName=" + fullName + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) { 
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
