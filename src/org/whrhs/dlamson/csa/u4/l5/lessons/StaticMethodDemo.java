package org.whrhs.dlamson.csa.u4.l5.lessons;

import java.util.Scanner;

public class StaticMethodDemo {

	public static Scanner scan = new Scanner(System.in);
	
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static void main(String[] pizza) {
		int number = 13;
		boolean b = isEven(number);
		
		System.out.println(b);
	}
}
