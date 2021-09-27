package com.technoelevate;

public class Challenge3 {

	public void printEqual(int num1,int num2,int num3) {
		if(num1<0 || num2<0 || num3<0) {
			System.out.println("Invalied Value");
		}
		else if(num1==num2 && num2==num3) {
			System.out.println("All Numbers are Equal");
		}
		else if(num1!=num2 && num2!=num3 && num1!=num3){
			System.out.println("All Numbers are different");
		}
		else {
			System.out.println("Neither All Numbers are Equal or Different");
		}
	}

}
