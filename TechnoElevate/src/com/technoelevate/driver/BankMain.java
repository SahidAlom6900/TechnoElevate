package com.technoelevate.driver;

import com.technoelevate.Bank;

public class BankMain {

	public static void main(String[] args) {
		Bank bank = new Bank("SBI", "Sahid Alom", 1234506789, 1500, 560034);
		bank.details();
		System.out.println("**************************************************************");
		System.out.println("Deposie 10000");
		bank.deposite(10000);
		bank.details();
		System.out.println("**************************************************************");
		System.out.println("Wihdraw 2000");
		bank.withdraw(2000);
		bank.details();
		System.out.println("**************************************************************");
		System.out.println("Reset Pincode");
		bank.setPincode(560035);
		bank.details();
		System.out.println("**************************************************************");
		System.out.println("Getting Account Number");
		System.out.println(bank.getBank_name()+bank.getNumber());
	}
}
