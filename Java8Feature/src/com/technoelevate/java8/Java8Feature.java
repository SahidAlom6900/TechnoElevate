package com.technoelevate.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Java8Feature {

	public static void main(String[] args) {

		//Lambda
		//Method Ref
		//Function interface
		//foreach
		//stream api
		//date time api
		
		LocalDateTime date=LocalDateTime.now();
		DateTimeFormatter ofPattern1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String format2 = date.format(ofPattern1);
		System.out.println("Formate : "+format2);
		System.out.println(date);
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate of = LocalDate.of(2021, 9, 21);
		int compareTo = of.compareTo(now);
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format = now.format(ofPattern);
		System.out.println(format);
		System.out.println("compareTo : "+compareTo);
		Month month = now.getMonth();
		System.out.println("month : "+month);
		int dayOfMonth = now.getDayOfMonth();
		System.out.println("dayOfMonth : "+dayOfMonth);
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		System.out.println("dayOfWeek : "+dayOfWeek);
		int dayOfYear = now.getDayOfYear();
		System.out.println("dayOfYear : "+dayOfYear);
		int monthValue = now.getMonthValue();
		System.out.println("monthValue : "+monthValue);
	}

}
