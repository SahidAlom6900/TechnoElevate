package com.technoelevate.main;

import java.util.Iterator;

import com.technoelevate.classes.MyArray;

public class MyArrayList {

	public static void main(String[] args) {

		MyArray myArray = new MyArray(9);
		myArray.addElement(10);
		myArray.addElement(20);
		myArray.addElement(30);
		myArray.addElement(40);
		myArray.addElement(50);
		myArray.addElement(60);
		myArray.addElement(70);
		myArray.addElement(80);
		myArray.addElement(90);
		System.out.println("*********************To String***********************");
		System.out.println(myArray);
		Object removeElement = myArray.removeElement(0);
		System.out.println("**********************Using Iterator*****************");
		System.out.println("Remove Object : "+removeElement);
		Iterator iterator = myArray.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		Object removeObject = myArray.removeObject(40);
		System.out.println("\n*******************Using For Each*********************");
		System.out.println("Remove Object : "+removeObject);
		for (Object object : myArray) {
			System.out.print(object+" ");
		}

	}

}
