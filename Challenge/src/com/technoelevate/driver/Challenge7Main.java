package com.technoelevate.driver;

import com.technoelevate.Challenge7;

public class Challenge7Main {

	public static void main(String[] args) {

		Challenge7 ch7 = new Challenge7();
		int sumOdd = ch7.sumOdd(1, 10);
		if(sumOdd!=-1) {
			System.out.println("Odd Number Sum : "+sumOdd);
		}
		else {
			System.out.println("invalied Number !!!");
		}
	}

}
