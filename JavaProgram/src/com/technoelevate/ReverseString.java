package com.technoelevate;

public class ReverseString {

	public static void main(String[] args) {
		String str1 = "JAVA IS AN PROGRAMMING LANGUAGE.";
		String str2 = "";
		String str3 = "";
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (ch != ' ' && ch !='.') {
				str2 = str2 + ch;
			} 
			else {
				str3 = str3 + reverseString(str2);
				str2 = "";
			}
		}
		System.out.println(str3);
	}
	private static String reverseString(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(str.length() - 1 - i);
			str1 = str1 + ch;
		}
		return str1 + " ";
	}

		/*
		 * String str = "JAVA IS A PROGRAMMING LANGUAGE"; String[] split =
		 * str.split(" "); str = ""; for (int i = 0; i < split.length; i++) {
		 * StringBuffer string = new StringBuffer(); string.append(split[i]); str = str
		 * + string.reverse() + " ";
		 * 
		 * } Sy
		 stem.out.println(str);*/

	
}
