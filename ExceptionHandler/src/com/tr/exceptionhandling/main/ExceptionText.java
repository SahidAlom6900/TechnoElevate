package com.tr.exceptionhandling.main;

public class ExceptionText {

	public static void main(String[] args) {

		try {
			Election.vote(15);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
