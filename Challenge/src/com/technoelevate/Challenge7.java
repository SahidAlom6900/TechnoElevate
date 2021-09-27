package com.technoelevate;

public class Challenge7 {

	private boolean isOdd(int number) {
		if (number % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public int sumOdd(int start, int end) {
		int sum = 0;
		if (start <= end) {
			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					sum = sum + i;
				}
			}
			return sum;
		}
		return -1;
	}
}
