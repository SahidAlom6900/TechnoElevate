package com.ty.sort;

import java.util.Comparator;

import com.ty.entity.Student;

public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

	

}
