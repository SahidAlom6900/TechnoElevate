package com.technoelevate.main;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.technoelevate.cla.Student;

public class MockTestMain {
	public static void main(String[] args) {

		TreeMap<String, Student> treeMap = new TreeMap<String, Student>();
		Student student1 = new Student(1, "Sahid", 12345789L);
		Student student2 = new Student(1, "Sahin", 12345789L);
		Student student3 = new Student(1, "Kanchan", 12345789L);
		Student student4 = new Student(1, "Sameer", 12345789L);
		Student student5 = new Student(1, "Veera", 12345789L);
		treeMap.put(student1.getName(), student1);
		treeMap.put(student2.getName(), student2);
		treeMap.put(student3.getName(), student3);
		treeMap.put(student4.getName(), student4);
		treeMap.put(student5.getName(), student5);
		Set<Entry<String, Student>> entrySet = treeMap.entrySet();
		for (Map.Entry<String, Student> entry : entrySet) {
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
	}
}
