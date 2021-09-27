package com.technoelevate.cla;

public class Manufacture extends Thread {
	int quantity;
	Godown godown;

	public Manufacture(int quantity, Godown godown) {
		this.quantity = quantity;
		this.godown = godown;
	}

	@Override
	public void run() {
		this.godown.store(quantity);
	}
	
	

}
