package com.technoelevate.cla;

public class Godown {
	private int quantity;

	public Godown(int quantity) {
		this.quantity = quantity;
	}
	synchronized public void store(int quantity) {
		this.quantity+=quantity;
		System.out.println("Item Added Successfully........");
		this.notify();
	}
	public int getQuantity() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return quantity;
	}
	synchronized public void purchesed(int quantity) {
		while(this.quantity<quantity) {
			System.err.println("Out of Stock!!! Please Wait........");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.quantity-=quantity;
		System.out.println("Item Purchesed Successfully....");
	}
}
