package com.technoelevate;

public class Challenge12 {
	
	public int printFactor(int number) {
		int count=0;
		if(number<0 || number==1) {
			return -1;
		}
		else {
			for(int i=1;i<=number/2;i++) {
				if(number%i==0) {
					count++;
				}
			}
			return count;
		}
	}

}
