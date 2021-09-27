package com.technoelevate.main;

import com.technoelevate.classes.CustomArrayListDemo;
import com.technoelevate.inter.CustomArrayListInter;

public class CustomArrayListDemoMain {

	public static void main(String[] args) {

		CustomArrayListInter arr=new CustomArrayListDemo(10);
		arr.addObject("1sahid");
		arr.addObject("2sahid");
		arr.addObject("3sahid");
		arr.addObject("4sahid");
		arr.addObject("5sahid");
		arr.addObject("6sahid");
		arr.addObject("7sahid");
		arr.addObject("8sahid");
		arr.addObject("9sahid");
		arr.addObject("10sahid");
		arr.addObject("11sahid");
		arr.addObject("12sahid");
		arr.addObject("13sahid");
		arr.addObject("14sahid");
		arr.addObject("15sahid");
		arr.addObject("16sahid");
		arr.addObject("17sahid");
		arr.addObject("18sahid");
		arr.addObject("19sahid");
		arr.addObject("20sahid");
		arr.addObject("21sahid");
		arr.addObject("22sahid");
		
		for(int i=0;i<arr.getSize();i++) {
			System.out.println(arr.getObject(i));
		}
		System.out.println(arr.getSize());
		
		arr.removeObject(10);
		System.out.println("**********************************************************");
		
		for(int i=0;i<arr.getSize();i++) {
			System.out.println(arr.getObject(i));
		}
		System.out.println(arr.getSize());
	}

}
