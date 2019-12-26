package org.whrhs.dlamson.csa.u4.l5.lessons;

import java.util.Scanner;

public class StaticDemo {
	
	public static Scanner scan = new Scanner(System.in);
	
	public int mystery() {
		return 0;
	}
	public static void main(String[] pizza) {
		
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Hello " + name);
		scan.close();
	}

}
