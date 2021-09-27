package com.tr.exceptionhandling.main;

import java.util.Scanner;

public class TextMain {

	public static void main(String[] args) {

		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numerator number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Denomerator");
		int num2 = sc.nextInt();
		try {
			num = num1 / num2;
			System.out.println("The Result is" + num);
		} catch (Exception e) {
			System.err.println("something worng");
		}
		sc.close();
	}

}
