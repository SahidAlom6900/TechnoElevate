package com.technoelevate.java8.main;

import com.technoelevate.java8.cla.MethodReferenceClass;
import com.technoelevate.java8.cla.Student;
import com.technoelevate.java8.inter.MethodReferenceInter;
import com.technoelevate.java8.inter.StudentInter;

public class MethodReferenceMain {
	
	public static void main(String[] args) {
		MethodReferenceInter methodReferenceInter=MethodReferenceClass::staticReference;
		methodReferenceInter.methodReferenceInter();
		MethodReferenceClass methodReferenceClass = new MethodReferenceClass();

		MethodReferenceInter methodReferenceInter1=methodReferenceClass::reference;
		methodReferenceInter1.methodReferenceInter();
		
		StudentInter inter=Student::new;
		System.out.println(inter.getStudent1("sahid"));
	}

}
