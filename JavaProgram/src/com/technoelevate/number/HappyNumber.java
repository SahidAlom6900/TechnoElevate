package com.technoelevate.number;

public class HappyNumber {

	public static void main(String[] args) {

		int num=16,sum=0;
		boolean b=false;
		while(!b) {
			while(num>0) {
				int temp=num%10;
				sum=sum+temp*temp;
				num=num/10;
			}
			if(sum==1 || sum==7) {
				
			   System.out.println("It Is Happy Number");
			}
			if(sum==4) {
				b=true;
				System.out.println("It Is not Happy Number");
			}
			num=sum;
			sum=0;
		}
	}

}
