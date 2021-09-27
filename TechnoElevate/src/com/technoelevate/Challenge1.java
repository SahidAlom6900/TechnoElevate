package com.technoelevate;

import java.util.Scanner;

//design a method to accept username and password of String type and print with a sms user name seccessfully logged in
//method name lonin
public class Challenge1 {
	boolean quit = false;
	boolean uname=false;
	private  boolean flag;
	String username;
	String password;
	
	{
		while(!quit) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the key like login or logout or add");
			String key=sc.next();
			switch (key) {
			    case "login":
			    	if(!uname) {
			    		System.out.println("enter the user name and password");
				    	username=sc.next();
						password =sc.next();
						uname=true;
			    	}
			    	
			    	login(username, password);
				break;
			    case "add":
			    		System.out.println(add(1, 2));
				    	System.out.println(add(1.2f, 1.5f));
				    	System.out.println(add(4.8, 5.7));
				    	System.out.println(add(4, 8.3));
				    	System.out.println(add(4.8, 5));
				    	System.out.println(add(4.5f, 8.3));
			    	
			    	break;
				
                case "logout":		
                	System.out.println(logOut());
                	quit=true;
				break;

			    default:
			    	System.out.println("please Enter the currect key");
				break;
			}
		}
	}
	
	public void login(String username, String password) {
		username.trim();

		if (username != null && username != "" && !flag) {
			flag=true;
			System.out.println(username + " successfully registered");
		} 
		else if(flag){
			System.out.println("you Already loged in");
		}
		else {
			System.out.println("please Enter the user name and pwd");
		}

	}
	
	public int add(int a,int b) {
		return a+b;
	}
	public float add(float a,float b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public double add(int a,double b) {
		return a+b;
	}

	public String logOut() {

		if(flag) {
			flag=false;
			return "Successfully LogOut";
		}
		else
			return "Please 1St login";

	}

	public Challenge1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
