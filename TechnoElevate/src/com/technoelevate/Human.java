package com.technoelevate;

public class Human {

	private String name;
	private int age;
	private float height;
	private String dob;
	private long contact;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Human(String name, int age, float height, String dob, long contact) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.dob = dob;
		this.contact = contact;
	}

	public Human() {
	}

	public void sleep() {
		System.out.println("Peace.............||...........araam");
	}

	@Override
	public String toString() {
		return "Name=" + name + "\nAge=" + age + "\nHeight=" + height + "\nDOB=" + dob + "\nContact=" + contact;
	}
}
