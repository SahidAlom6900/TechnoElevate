package com.technoelevate.driver;

import java.util.Scanner;

import com.technoelevate.Challenge4;

public class Challenge4Main {

	public static void main(String[] args) {
		
		System.out.println("Enter the boolean value of Summer and int type Temperature");
		Scanner scanner = new Scanner(System.in);
		boolean summer=scanner.nextBoolean();
		int temperature=scanner.nextInt();
		Challenge4 ch = new Challenge4();
		boolean catPlaying = ch.isCatPlaying(summer, temperature);
		if(catPlaying) {
			System.out.println("Cat is Playing");
		}else {
			System.out.println("Cat is not Playing");
		}
		scanner.close();
	}

}
