package com.technoelevate.cla;

public class Customer extends Thread {
	int quantity;
	Godown godown;

	public Customer(int quantity, Godown godown) {
		this.quantity = quantity;
		this.godown = godown;
	}

	@Override
	public void run() {
		this.godown.purchesed(quantity);
	}

}
