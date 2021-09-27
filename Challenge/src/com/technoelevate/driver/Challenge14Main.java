package com.technoelevate.driver;

import com.technoelevate.Challenge14;

public class Challenge14Main {

	public static void main(String[] args) {

		Challenge14 ch14 = new Challenge14();
		boolean pack = ch14.canPack(1, 5, 9);
		if (pack) {
			System.out.println("Can Pack");
		} else {
			System.out.println("Can not Pack");
		}

	}

}
