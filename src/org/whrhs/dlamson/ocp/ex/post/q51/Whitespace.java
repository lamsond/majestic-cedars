package org.whrhs.dlamson.ocp.ex.post.q51;

public class Whitespace {

	public static void main(String[] args) {
		String testStr = "    white    space    ";
		String empty = "";
		String whiteOnly = "    ";
		
		// trim cuts leading and trailing whitespace, not whitespace in middle
		System.out.println("testStr.trim() = " + testStr.trim());
		
		// isBlank() checks if empty OR all whitespace
		System.out.println("testStr.isBlank() = " + testStr.isBlank());
		System.out.println("empty.isBlank() = " + empty.isBlank());
		System.out.println("whiteOnly.isBlank() = " + whiteOnly.isBlank());
	}
}
