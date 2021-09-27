package com.tr.exceptionhandling.main;

public class Election {
	
	public static void vote(int age) {
		if(age<18) {
			throw new AgeValidation("Not Elegible For Vote");
		}else {
			System.out.println();
		}
	}

}
