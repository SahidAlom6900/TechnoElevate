package com.technoelevate;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "JAVA IS AN PROGRAMMING LANGUAGE";
		char ch[] = str.toCharArray();
		int p = 0, t = 0, k = 0;
		for (int i = 0; i < str.length(); i++) {
			k = 0;
			if (ch[i] != ' ' && i != str.length() - 1) {
				p++;
				continue;
			}
			if (i == str.length() - 1) {
				i++;
				p++;
			}
			for (int j = t; j <= t + (p - 1) / 2; j++) {
				char temp = ch[j];
				ch[j] = ch[t + p - k - 1];
				ch[t + p - k - 1] = temp;
				k++;
			}
			t = i + 1;
			p = 0;
		}
		for (char c : ch) {
			System.out.print(c);
		}
	}

}
