package org.whrhs.dlamson.csa.u7.l1;

import java.util.ArrayList;
import java.util.Scanner;

public class IntroArrayList {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			ArrayList<Integer> factors = new ArrayList<>();
			
			System.out.print("Enter a number: ");
			int n = scan.nextInt();
			// make a loop that goes through numbers less than n and
			// checks if they are factors...then add them to the factor list
			for(int j = 1;  j <= n; j++) {
				if(n % j == 0) {
					factors.add(j);
				}
			}
			System.out.println(factors);
		}
		
	}

}
