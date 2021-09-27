package com.tr.exceptionhandling.main;

import com.tr.exceptionhandling.CustomizedExceptionHandler;
import com.tr.exceptionhandling.entity.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student("Sahid", -100);

		try {
			new StudentRollException().rollException(std.getRoll());
		} catch (CustomizedExceptionHandler e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}
}
