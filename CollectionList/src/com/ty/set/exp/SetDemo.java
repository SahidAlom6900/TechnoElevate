package com.ty.set.exp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static HashSet<Integer> hashSet = new HashSet<Integer>();
	public static void main(String[] args) {
		
		for(int i=10;i<=100;i=i+10) {
			hashSet.add(i);
		}
		System.out.println(hashSet);
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static HashSet<Integer> getHashSet() {
		return hashSet;
	}

}
