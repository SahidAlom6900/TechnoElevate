package com.technoelevate.multithreading;

import com.technoelevate.multithreading.classes.Customer;
import com.technoelevate.multithreading.classes.Godown;
import com.technoelevate.multithreading.classes.Manufacture;

public class DeadLock {

	public static void main(String[] args) {
		Godown godown=new Godown(100);
		Customer customer=new Customer(60, godown);
		customer.start();
		Customer customer1=new Customer(60, godown);
		customer1.start();
		Manufacture manufacture = new Manufacture(100, godown);
		manufacture.start();
	}
}
