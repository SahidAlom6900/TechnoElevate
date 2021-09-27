package com.technoelevate.driver;

import com.technoelevate.Challenge11;

public class Challenge11Main {

	public static void main(String[] args) {

		Challenge11 ch11 = new Challenge11();
		boolean b = ch11.hasSameLastDigit(22, 33, 44);
		if(b) {
			System.out.println("There last two digits are same");
		}else {
			System.out.println("There is no two digits are same");
		}
		
	}

}
