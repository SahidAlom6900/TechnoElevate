package com.technoelevate.spring;

public class PalindromString {

	public static void main(String[] args) {
		boolean b=true;
		String str="MADAM";
		char[] ch=str.toCharArray();
		for (int i = 0; i <= str.length()/2; i++) {
			if(ch[i]!=ch[str.length()-1-i]) {
				b=false;
			}
		}
		if(b) {
			System.out.println("Palindrom String");
		}else {
			System.out.println("not Palindrom String");
		}
	}

}
