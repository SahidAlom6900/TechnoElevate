package com.ty.set.exp;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet< Integer> integers=new TreeSet<Integer>();
		integers.add(50);
		integers.add(60);
		integers.add(20);
		integers.add(30);
		integers.add(40);
		integers.add(80);
		integers.add(70);
		integers.add(10);
		integers.add(100);
		System.out.println(integers.first());
		System.out.println(integers.last());
		System.out.println("===========HeadSet++++++++++++++++++");
		SortedSet<Integer> headSet = integers.headSet(50);
		for (Integer integer : headSet) {
			System.out.println(integer);
		}
		System.out.println("===========TailSet++++++++++++++++++");
		SortedSet<Integer> tailSet = integers.tailSet(50);
		for (Integer integer : tailSet) {
			System.out.println(integer);
		}
		Map k;
	}

}
