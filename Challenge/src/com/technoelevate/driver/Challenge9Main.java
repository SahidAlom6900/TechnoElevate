package com.technoelevate.driver;

public class Challenge9Main {
	int sum = 0;

	public static void main(String[] args) {
	   Challenge9Main ch9 = new Challenge9Main();
	   int sum = ch9.getEvenDigitSum(10);
	   System.out.println("Sum of Even Digit: "+sum);
	}

	public int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
