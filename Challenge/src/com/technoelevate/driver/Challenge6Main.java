package com.technoelevate.driver;

public class Challenge6Main {

	public static void main(String[] args) {

		int sum=0;
		int count=0;
		for(int i=1;i<=1000;i++) {
			if(count>=5) {
				break;
			}
			if(i%3==0 && i%5==0) {
				sum=sum+i;
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nsum of 5 numbers : "+sum);
	}

}
