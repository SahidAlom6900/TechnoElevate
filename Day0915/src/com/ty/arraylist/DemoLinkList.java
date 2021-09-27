package com.ty.arraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DemoLinkList {

	public static void main(String[] args) {

		
		List linkedList=new LinkedList<>();
		linkedList.add("Sahid");
		linkedList.add("Veera");
		linkedList.add("Sameer");
		linkedList.add("Sandeep");
		linkedList.add(true);
		System.out.println("---------------------Normal for loop-------------------------");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		
		System.out.println("---------------------For Each Loop-----------------------");
		
		for (Object object : linkedList) {
			System.out.println(object);
		}
		
		System.out.println("---------------------Iterator-------------------------");
		
		Iterator<Object> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			Object obj=iterator.next();
			System.out.println(obj);
		}
		
		System.out.println("---------------------List Iterator Forword Direction-----------------------");
		
		ListIterator<Object> listIterator = linkedList.listIterator();
		
		while(listIterator.hasNext()) {
			Object previous = listIterator.next();
			System.out.println(previous);
		}
		
		System.out.println("---------------------List Iterator Backword Direction-----------------------");
		ListIterator<Object> listIterator1 = linkedList.listIterator(linkedList.size());
		
		while(listIterator1.hasPrevious()) {
			Object previous = listIterator1.previous();
			System.out.println(previous);
		}
		
	}

}
