package com.tr.exceptionhandling.main;

public class AgeValidation extends RuntimeException {
	
	private static final long serialVersionUID = 5506203443828667218L;
	String msg;

	public AgeValidation(String msg) {
		this.msg = msg;
	}

	public AgeValidation() {
	}

	@Override
	public String getMessage() {
		return this.msg;
	}

	@Override
	public void printStackTrace() {
System.out.println("jhgdjdgdgjdsg");
	}

}
