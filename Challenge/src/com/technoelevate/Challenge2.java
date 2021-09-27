package com.technoelevate;

public class Challenge2 {
	public double area(double r) {
		if (r > 0) {
			return 3.14 * r * r;
		}
		return -1;
	}

	public double area(int x, int y) {
		if (x > 0 && y > 0) {
			return x * y;
		}
		return -1;
	}
}
