package com.technoelevate;

public class HorseMove {

	
	
	public static void main(String[] args) {

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==2 && j==2) {
					System.out.print("   *");
				}
				if((i+j)%2==1 && j!=2 && i!=2) {
						System.out.print("  *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
