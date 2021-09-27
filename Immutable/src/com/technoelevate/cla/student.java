package com.technoelevate.cla;

public final class student {

	private int id;
	private String name;

	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}

}
