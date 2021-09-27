package com.technoelevate;

public class Challenge5 {
	
	public String printNumberInWord(int num) {
		String[] str= {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
		if(num>0 && num<10) {
			return str[num];
		}
		return "Invalied Input";
	}

}
