package com.technoelevate.driver;

import com.technoelevate.Challenge8;

public class Challenge8Main {

	public static void main(String[] args) {
		Challenge8 ch8 = new Challenge8();
		int sum = ch8.sumFirstAndLastDigit(874541238);
		if(sum!=-1) {
			System.out.println(sum);
		}else {
			System.out.println("invalied number!!!");
		}
		
	}

}
