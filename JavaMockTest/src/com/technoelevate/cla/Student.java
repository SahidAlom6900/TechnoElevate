package com.technoelevate.cla;

public class Student {
	private Integer id;
	private String name;
	private Long contact;

	public Student(Integer id, String name, Long contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Student() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", contact=" + contact;
	}

}
