package com.technoelevate;

public class Challenge15 {
	public int getBucketCount(double width, double height, double areaPerBucket, double extraBucket) {
		if(width<0 || height<0 || extraBucket<0 || areaPerBucket<0) {
			return -1;
		}
		double totalArea =width*height;
		double workForExtraBucket=areaPerBucket*extraBucket;
		double leftArea=totalArea-workForExtraBucket;
		double noBucket=leftArea/areaPerBucket;
		return (int) noBucket;
	}
}
