package com.technoelevate;

public class Challenge10 {
	public boolean hasSharedDigit(int num1 , int num2) {
		if(num1<10 && num2>100) {
			return false;
		}
		int num1f=num1/10;
		num1=num1%10;
		int num2s=num2/10;
		num2=num2%10;
		if(num1f==num2s || num1f==num2) {
			return true;
		}
		if(num1==num2s || num1==num2) {
			return true;
		}
		return false;
	}
}
