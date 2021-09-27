package com.technoelevate.number;

public class NevinNumber {

	public static void main(String[] args) {

		int num=63,sum = 0;
		int number=num;
		while(num>0) {
			int temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		if(num%sum==0) {
			System.out.println("It Is A Nevin number");
		}
	}

}
