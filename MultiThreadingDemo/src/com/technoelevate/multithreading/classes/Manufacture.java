package com.technoelevate.multithreading.classes;

public class Manufacture extends Thread {
	
	int item;
	Godown godown;
	public Manufacture(int item, Godown godown) {
		this.item = item;
		this.godown = godown;
	}
	@Override
	public void run() {
		godown.store(item);
	}

}
