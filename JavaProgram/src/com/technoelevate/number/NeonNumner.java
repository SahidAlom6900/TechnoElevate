package com.technoelevate.number;

public class NeonNumner {

	public static void main(String[] args) {

		int num=9,sum=0;
		int sq=num*num;
		while(sq>0) {
			int temp=sq%10;
			sum=sum+temp;
			sq=sq/10;
		}
		if(num==sum) {
			System.out.println("It is Neon Number");
		}
	}

}
