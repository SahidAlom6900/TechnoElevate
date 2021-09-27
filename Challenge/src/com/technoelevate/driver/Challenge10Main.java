package com.technoelevate.driver;

import com.technoelevate.Challenge10;

public class Challenge10Main {

	public static void main(String[] args) {

		Challenge10 ch10 = new Challenge10();
		boolean digit = ch10.hasSharedDigit(12, 23);
		if(digit) {
			System.out.println("Contain that two Similar Value");
		}else {
			System.out.println("There is no Similar Value");
		}
		
	}

}
