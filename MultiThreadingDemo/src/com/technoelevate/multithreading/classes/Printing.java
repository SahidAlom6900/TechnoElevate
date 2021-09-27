package com.technoelevate.multithreading.classes;

public class Printing {

	synchronized public static void print(int x, int y) {
		for (int i = x; i < y; i++) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Printing... " + i);
		}
	}

	synchronized public static void print1(int x, int y) {
		for (int i = x; i < y; i++) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Printing... " + i);
		}
	}

	synchronized public static void print2(int x, int y) {
		for (int i = x; i < y; i++) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Printing... " + i);
		}
	}

}
