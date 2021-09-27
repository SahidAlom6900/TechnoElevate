package com.technoelevate.search;

public class BinarySearch {
	public static int binarySearch(int []arr,int l,int r,int x) {
		while(r>=l) {
			int mid=(l+r)/2;
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]>x) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return -1;
	}
}




