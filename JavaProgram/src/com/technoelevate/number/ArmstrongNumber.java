package com.technoelevate.number;

public class ArmstrongNumber{

	public static void main(String[] args) {
		Integer num=1634,sum=0;
		int number=num;
		int length = num.toString().length();
		while(num>0) {
			int temp=num%10;
			sum=sum+pow(temp,length);
			num=num/10;
		}
		if(number==sum) {
			System.out.println("it is Armstrong number");
		}
	}

	private static Integer pow(int temp, int length) {
		int sum=1;
		for (int i = 0; i < length; i++) {
			sum=sum*temp;
		}
		return sum;
	}
}
