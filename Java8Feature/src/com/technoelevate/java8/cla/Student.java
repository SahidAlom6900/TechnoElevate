package com.technoelevate.java8.cla;

public class Student {
	
	String i;

	public Student(String i) {
		this.i = i;
	}

	public Student getStudent(String i) {
		return new Student(i);
	}

	@Override
	public String toString() {
		return "Student [i=" + i + "]";
	}

}
