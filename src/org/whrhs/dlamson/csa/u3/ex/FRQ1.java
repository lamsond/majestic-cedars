package org.whrhs.dlamson.csa.u3.ex;

public class FRQ1 {
	// +1 correct return type +1 correct parameter +1 static
	public static String getDashes(String word) {
		String result = ""; // +2 result string
		
		for(int i = 0; i < word.length(); i++) { // +1 correct loop
			if(word.charAt(i) != ' ') { // +2 correctly check for space
				result += "-"; // +3 correctly add dash
			}
			else {
				result += " "; // +2 correctly add space
			}
		}
		
		return result; // +2 return result
	}
	
	public static void main(String[] args) {
		String str1 = "banana";
		String str2 = "pot pie";
		System.out.println(str1);
		System.out.println(getDashes(str1));
		System.out.println(str2);
		System.out.println(getDashes(str2));
	}
}
