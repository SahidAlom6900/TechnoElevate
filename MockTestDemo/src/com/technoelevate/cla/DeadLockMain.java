package com.technoelevate.cla;

public class DeadLockMain {

	public static void main(String[] args) {

		Godown godown = new Godown(100);
		Customer customer = new Customer(80, godown);
		customer.start();
		int quantity = godown.getQuantity();
		System.out.println("Remaining Quantity : "+quantity);
		Customer customer1 = new Customer(40, godown);
		customer1.start();
		Manufacture manufacture = new Manufacture(100, godown);
		manufacture.start();
		int quantity1 = godown.getQuantity();
		System.out.println("Remaining Quantity : "+quantity1);
	}

}
