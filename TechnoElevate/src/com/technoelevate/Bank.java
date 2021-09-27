package com.technoelevate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
	String bank_name;
	String account_holder_name;
	long number;
	float bal;
	int pincode;

	
	public Bank(String bankName, String accountHolderName, long number, float bal) {
		this.bank_name = bankName;
		this.account_holder_name = accountHolderName;
		this.number = number;
		this.bal = bal;
	}

	

	public void deposite(float amount) {
		if (bal > 0) {
			bal = bal + amount;
		}else
		System.out.println("Insufficient blance");
	}

	public void details() {
		String accountNumber=bank_name+number;
		System.out.println("Bank Name : " + bank_name + "\nAccoun Holder Name :" + account_holder_name
				+ "\nAccoun Number :" + accountNumber + "\nBlance : " + bal);
	}

	public void withdraw(float amount) {
		if (bal > 0 && amount < bal) {
			bal = bal - amount;
		} 
		else {
		System.out.println("Insufficient blance");
		}
	}
}






















