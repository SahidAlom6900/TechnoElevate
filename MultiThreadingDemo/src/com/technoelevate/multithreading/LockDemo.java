package com.technoelevate.multithreading;

import com.technoelevate.multithreading.classes.Printing;
import com.technoelevate.multithreading.classes.PrintingThreadDemo;
import com.technoelevate.multithreading.classes.PrintingThreadDemo1;
import com.technoelevate.multithreading.classes.PrintingThreadDemo2;

public class LockDemo {

	public static void main(String[] args) {
		Printing printing = new Printing();
		Thread thread = new PrintingThreadDemo(100, 110, printing);
		thread.start();
		Thread thread2 = new PrintingThreadDemo1(100, 110, printing);
		thread2.start();
		Thread thread1 = new PrintingThreadDemo2(200, 210, printing);
		thread1.start();

	}

}
