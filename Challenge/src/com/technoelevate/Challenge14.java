package com.technoelevate;

public class Challenge14 {
	public boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount <= 0 || smallCount <= 0 || goal <= 0) {
			return false;
		}
		boolean idiTrmp=false;
		goal = goal - bigCount*5;
		if ((goal < smallCount && goal > 0) || (goal < smallCount)) {
			idiTrmp= true;
		} 
		return idiTrmp;
	}
}
