package com.technoelevate.number;

public class StrongNumber {

	public static void main(String[] args) {

		int num=145,sum=0;
		int number=num;
		while(num>0) {
			int temp=num%10;
			sum=sum+sumFact(temp);
			num=num/10;
		}
		if(number==sum) {
			System.out.println("It is a Strong Number");
		}
	}

	private static int sumFact(int temp) {
		int fact=1;
		for(int i=1;i<=temp;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
