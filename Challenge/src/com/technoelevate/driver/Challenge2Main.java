package com.technoelevate.driver;

import com.technoelevate.Challenge2;

public class Challenge2Main {

	public static void main(String[] args) {

		Challenge2 ch2 = new Challenge2();
		double a1 = ch2.area(5);
		double a2 = ch2.area(5, 5);
		if(a1>=0) {
			System.out.println("Area of Circle : "+a1);
		}else {
			System.out.println("Invalied Area");
		}
		if(a2>=0) {
			System.out.println("Area of Rect. : "+a2);
		}else {
			System.out.println("Invalied Area");
		}
	}

}
