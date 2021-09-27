package com.ty.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoArrayList {

	public static void main(String[] args) {
		List arrl=new ArrayList();
		arrl.add("Sahid");
		arrl.add("Veera");
		arrl.add("Sameer");
		arrl.add("Sandeep");
		arrl.add(true);
		System.out.println("---------------------Normal for loop-------------------------");
		for (int i = 0; i < arrl.size(); i++) {
			System.out.println(arrl.get(i));
		}
		
		System.out.println("---------------------For Each Loop-----------------------");
		
		for (Object object : arrl) {
			System.out.println(object);
		}
		
		System.out.println("---------------------Iterator-------------------------");
		
		Iterator<Object> iterator = arrl.iterator();
		while(iterator.hasNext()) {
			Object obj=iterator.next();
			System.out.println(obj);
		}
		
		System.out.println("---------------------List Iterator Forword Direction-----------------------");
		
		ListIterator<Object> listIterator = arrl.listIterator();
		
		while(listIterator.hasNext()) {
			Object previous = listIterator.next();
			System.out.println(previous);
		}
		
		System.out.println("---------------------List Iterator Backword Direction-----------------------");
		ListIterator<Object> listIterator1 = arrl.listIterator(arrl.size());
		
		while(listIterator1.hasPrevious()) {
			Object previous = listIterator1.previous();
			if(previous.equals("Sahid")) {
				listIterator1.remove();
			}else
			System.out.println(previous);
		}
		String str;
		
	}

}
