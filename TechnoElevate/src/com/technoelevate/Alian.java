package com.technoelevate;

public class Alian extends Human {
	
	int aid;

	public Alian(String name, int age, float height, String dob, long contact, int aid) {
		super(name, age, height, dob, contact);
		this.aid = aid;
	}
	@Override
	public void sleep() {
		System.out.println("updated sleep..............");
	}
}
