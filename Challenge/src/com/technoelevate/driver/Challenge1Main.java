package com.technoelevate.driver;

import com.technoelevate.Challenge1;

public class Challenge1Main {

	public static void main(String[] args) {

		Challenge1 ch1 = new Challenge1();
		String duration = ch1.getDurationString(158, 35);
		System.out.println("String Time Formate: "+duration);
		String duration1 = ch1.getDurationString(158);
		System.out.println("String Time Formate: "+duration1);
	}

}
