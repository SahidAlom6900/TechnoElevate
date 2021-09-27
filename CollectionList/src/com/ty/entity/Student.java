package com.ty.entity;

public class Student{
	private Integer id;
	private String name;
	private Integer marks;
	private Integer age;
	private Integer phNo;
	public Student(Integer id, String name, Integer marks, Integer age, Integer phNo) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
		this.phNo = phNo;
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
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getPhNo() {
		return phNo;
	}
	public void setPhNo(Integer phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return id +"   " + name + "   " + marks + "   " + age + "   " + phNo ;
	}

}
