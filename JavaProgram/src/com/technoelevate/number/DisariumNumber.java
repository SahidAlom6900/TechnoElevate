package com.technoelevate.number;

public class DisariumNumber {

	public static void main(String[] args) {

		Integer num=175,sum=0,k=0;
		int number=num;
		int length = num.toString().length();
		while (num>0) {
			int temp=num%10;
			sum=sum+disarium(temp,length-k);
			num=num/10;
			k++;
		}
		if(number==sum) {
			System.out.println("It is a disarium number");
		}
	}

	private static Integer disarium(int temp, int j) {
		int product=1;
		for(int i=1;i<=j;i++) {
			product=product*temp;
		}
		return product;
	}

}
