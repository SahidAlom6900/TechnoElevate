package com.technoelevate.number;

public class FebonacySeries {

	public static void main(String[] args) {

		int a=0,b=1,c=0;
		for (int i = 1; i <=20; i++) {
			System.out.print(b+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
