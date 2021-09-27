package com.ty.set.exp;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static Set<Integer> hashSet = new LinkedHashSet<Integer>();	

	public static void main(String[] args) {

		
		for(int i=10;i<=100;i=i+10) {
			hashSet.add(i);
		}
		hashSet.add(10);
		hashSet.add(null);
		System.out.println(hashSet);
		hashSet.add(null);
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static Set<Integer> getHashSet() {
		return hashSet;
	}

}
