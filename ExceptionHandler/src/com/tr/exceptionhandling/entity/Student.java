package com.tr.exceptionhandling.entity;

public class Student {

	private String name;
	private int roll;

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass() || obj == null)
			return false;
		Student other = (Student) obj;
		return this.name.equals(other.getName()) && this.roll==other.getRoll();
	}

}
