package com.ty.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ty.entity.Student;
import com.ty.exception.InvaliedInputException;
import com.ty.sort.SortByAge;
import com.ty.sort.SortByName;
import com.ty.sort.SortByPhNo;
import com.ty.sort.SortById;
import com.ty.sort.SortByMarks;

public class StudentMain {

	public static void main(String[] args) {
		boolean quit = false;
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> std = new ArrayList<Student>();
		std.add(new Student(100, "Sahid", 75, 25, 564123));
		std.add(new Student(105,"Manoj", 80, 24,548217));
		std.add(new Student(104,"Sandeep", 85, 25,856421));
		std.add(new Student(102,"Veera", 68, 23,532364));
		std.add(new Student(101,"Sameera", 87, 26,452187));
		std.listIterator();
		std.forEach(i->System.out.println(i););
		System.out.println("1.Sort By Id\n2.Sort By Name\n3.Sort By Marks\n4.Sort By Age \n5.Sort By Phone Number");
		while (!quit) {
			
			String i=sc.next();
			
			switch (i) {
			case "2":
				System.out.println("Sort By Name");
				System.out.println("----------------------------------------------------");
				Collections.sort(std, new SortByName());
				display(std);
				
				break;
			case "1":
				System.out.println("Sort By Id");
				System.out.println("----------------------------------------------------");
				Collections.sort(std, new SortById());
				display(std);
				break;
			case "4":
				System.out.println("Sort By Age");
				System.out.println("----------------------------------------------------");
				Collections.sort(std, new SortByAge());
				display(std);
				break;
			case "3":
				System.out.println("Sort By Marks");
				System.out.println("----------------------------------------------------");
				Collections.sort(std, new SortByMarks());
				display(std);
				break;
				
			case "5":
				System.out.println("Sort By Phone Number");
				System.out.println("----------------------------------------------------");
				Collections.sort(std, new SortByPhNo());
				display(std);
				break;
			case "n":
				quit=true;
				System.err.println("Shutdown!!!");
				break;
			case "y":
				System.out.println("1.Sort By Id\n2.Sort By Name\n3.Sort By Marks\n4.Sort By Age \n5.Sort By Phone Number");
				quit=false;
				break;
			default:
				try {
					throw new InvaliedInputException("Invalied Value Exception");
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
			
		}
	}

	public static void display(ArrayList<Student> list) {
		list.forEach(i->System.out.println(i));
		System.out.println("**************************************");
		System.out.println("do you want to continue y/n");
		Collections.Sy
	}

}
