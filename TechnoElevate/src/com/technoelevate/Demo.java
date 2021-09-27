package com.technoelevate;

public class Demo {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 2, 10 };
		int t = 0,a=10;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				t = arr[i];
			}
		}
		System.out.println(t);
		a++;
		System.out.println(a);
	}
}
