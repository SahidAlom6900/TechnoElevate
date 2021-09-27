package com.tr.exceptionhandling;

@SuppressWarnings("serial")
public class CustomizedExceptionHandler extends Exception {

	private String msg;

	public CustomizedExceptionHandler(String msg) {
		this.msg = msg;
	}

	CustomizedExceptionHandler() {
	}

	@Override
	public void printStackTrace() {
		System.err.println("Custom print Stack Trace");

	}

	@Override
	public String getMessage() {
		return this.msg;
	}

}
