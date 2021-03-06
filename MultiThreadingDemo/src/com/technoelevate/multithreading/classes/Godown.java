package com.technoelevate.multithreading.classes;

public class Godown {

	private int product;

	public Godown(int product) {
		this.product = product;
	}

	synchronized public void store(int item) {
		product += item;
		System.out.println("Item added Successfully...");
		this.notify();
	}

	synchronized public void purchase(int item) {
		while (item > this.product) {
			System.out.println("Out Of Stock ! Please Wiat...");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		this.product -= item;
		System.out.println("Successfully Purchased...");
	}

}
