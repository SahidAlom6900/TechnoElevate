package com.technoelevate.driver;

import com.technoelevate.Challenge12;

public class Challenge12Main {

	public static void main(String[] args) {

		Challenge12 ch12 = new Challenge12();
		int factor = ch12.printFactor(6);
		if(factor!=-1) {
			System.out.println("Factors are: "+factor);
		}else {
			System.out.println("invalied value!!!");
		}
	}

}
