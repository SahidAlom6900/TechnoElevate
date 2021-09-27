package com.technoelevate.multithreading.classes;

public class Customer extends Thread {
	int item;
	Godown godown;

	public Customer(int item, Godown godown) {
		this.item = item;
		this.godown = godown;
	}

	@Override
	public void run() {
		godown.purchase(item);
	}

}
