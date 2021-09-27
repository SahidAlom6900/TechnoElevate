package com.technoelevate;

import com.technoelevate.test.Assignment;

public class AssignmentMain {

	public static void main(String[] args) {

		Assignment assignment1 = new Assignment(100, 1);
		Assignment assignment2 = new Assignment(1, 100);
		System.out.println("Orange : "+assignment1.getO(1));
		System.out.println("Apple : "+assignment2.getA(1));
		
	}

}
