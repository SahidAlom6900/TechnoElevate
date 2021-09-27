package com.technoelevate;

public class Challenge11 {

	public boolean hasSameLastDigit(int num1,int num2,int num3) {
		if((num1<=10|| num2<=10 || num3<=10)&&(num1>1000|| num2>1000 || num3>1000)) {
			return false;
		}
		int num1r=num1%10;
		int num2r=num2%10;
		int num3r=num3%10;
		if(num1r==num2r || num2r==num3r || num1r==num3r) {
			return true;
		}
		return false;
	}
}
