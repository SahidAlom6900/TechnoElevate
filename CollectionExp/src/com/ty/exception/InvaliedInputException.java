package com.ty.exception;

public class InvaliedInputException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String msg;

	public InvaliedInputException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}

}
