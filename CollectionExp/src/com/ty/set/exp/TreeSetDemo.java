package com.ty.set.exp;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Collection<Integer> hashSet2 = LinkedHashSetDemo.getHashSet();
		Collection<Integer> hashSet = SetDemo.getHashSet();
		
		TreeSet< Integer> integers=new TreeSet<Integer>(hashSet);
		TreeSet< Integer> integers1=new TreeSet<Integer>(hashSet2);
		System.out.println(integers);
		System.out.println(integers1);
	}

}
