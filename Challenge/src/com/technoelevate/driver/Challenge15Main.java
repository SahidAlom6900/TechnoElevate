package com.technoelevate.driver;

import com.technoelevate.Challenge15;

public class Challenge15Main {

	public static void main(String[] args) {

		Challenge15 ch15 = new Challenge15();
		int count = ch15.getBucketCount(20, 10, 15, 5);
		if(count!=-1) {
			System.out.println("you have to buy : "+count+" Bucket");
		}
		else {
			System.out.println("invalied input");
		}
	}

}
