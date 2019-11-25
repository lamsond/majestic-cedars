package org.whrhs.dlamson.csa.u3.ex;

public class Lizzy {

	public static String hangman(String word) {
		int space = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == ' ') {
				space = i;
			}
			else {
				space = 0;
			}
		}
		
		int length = word.length();
		int j = 0;
		String hyphen = "";
		
		while(j <= length) {
			if(space != 0) {
				hyphen += "-";
				j++;	
			}
			else {
				hyphen += " ";
				j++;
			}
		}
		
		return hyphen;
	}
	
	public static void main(String[] args) {
		String str1 = "banana";
		String str2 = "pot pie";
		System.out.println(str1);
		System.out.println(hangman(str1));
		System.out.println(str2);
		System.out.println(hangman(str2));
	}
}
