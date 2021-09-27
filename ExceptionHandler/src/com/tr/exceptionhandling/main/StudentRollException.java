package com.tr.exceptionhandling.main;

import com.tr.exceptionhandling.CustomizedExceptionHandler;

public class StudentRollException {
	
	public void rollException(int roll) throws CustomizedExceptionHandler {

		if(roll<0) {
			throw new CustomizedExceptionHandler("Roll can not be -ve");
		}
		else {
			System.out.println("kjhudsudh");
		}
	}

}
