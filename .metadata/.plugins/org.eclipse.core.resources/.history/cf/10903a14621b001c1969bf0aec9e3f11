package com.technoelevate.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.technoelevate.entity.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Comparator<Employee> sortByid=(e1,e2)->{return e1.getId().compareTo(e2.getId());};
		Comparator<Employee> sortByName=(e1,e2)->{return e1.getName().compareTo(e2.getName());};
		Comparator<Employee> sortByCity=(e1,e2)->{return e1.getCity().compareTo(e2.getCity());};
		
		Set<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee(105,"Sahid","Assam"));
		hashSet.add(new Employee(102,"Veera","Andhra"));
		hashSet.add(new Employee(103,"Sameer","Karnataka"));
		hashSet.add(new Employee(106,"Sandeep","WB"));
		hashSet.add(new Employee(101,"Kanchan","Bihar"));
		hashSet.add(new Employee(104,"Sahin","Assam"));
		hashSet.add(new Employee(104,"Sahin","Assam"));
		
		System.out.println("=========================Using ArrayList=========================");
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>(hashSet);
		Collections.sort(arrayList,sortByid);
		System.out.println("*************************Sort By Id******************************");
		arrayList.forEach(i->System.out.println(i));
		Collections.sort(arrayList,sortByName);
		System.out.println("*************************Sort By Name******************************");
		arrayList.forEach(i->System.out.println(i));
		Collections.sort(arrayList,sortByCity);
		System.out.println("*************************Sort By City******************************");
		arrayList.forEach(i->System.out.println(i));
		
		System.out.println("=========================Using TreeSet=========================");
		
		TreeSet<Employee> treeSet1 = new TreeSet<Employee>(sortByid);
		TreeSet<Employee> treeSet2 = new TreeSet<Employee>(sortByName);
		TreeSet<Employee> treeSet3 = new TreeSet<Employee>(sortByCity);
		treeSet1.addAll(hashSet);
		treeSet2.addAll(hashSet);
		treeSet3.addAll(hashSet);
		System.out.println("*************************Sort By Id******************************");
		treeSet1.forEach(i->System.out.println(i));
		System.out.println("*************************Sort By Name******************************");
		treeSet2.forEach(i->System.out.println(i));
		System.out.println("*************************Sort By City******************************");
		treeSet3.forEach(i->System.out.println(i));
//		HashMap m;
	}
	
	
	//28/08/2021 14:42:59
//	Object key = e.getKey();
//    Object value = e.getValue();

}
