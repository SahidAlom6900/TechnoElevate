package com.technoelevate;

public class Challenge8 {
	int sum=0;
	public int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		Integer num = number;
		int len = num.toString().length();
		int first = (int) (number / Math.pow(10, (len-1)));
		int last = number % 10;
		sum = first + last;
		return sum;
	}
}
