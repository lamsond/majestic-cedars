package org.whrhs.dlamson.csa.u3.ex;

import java.util.Scanner;

public class FRQ2 {
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int previous = 1; // +1 create prev var
		int prime = 1; // +1 create prime var
		int score = 0; // +1 create score var
		while(true) { // +1 while loop
			System.out.println("Enter a prime: ");
			prime = Integer.parseInt(scan.nextLine()); // +1 get int from user
			if(prime > previous && isPrime(prime)) { // +2 validate prime, +2 validate greater than
				score++; // +1 increment score
				previous = prime; // +1 update previous var
			}
			else {
				break; // +2 exit loop on wrong variable
			}
		}
		System.out.println("Score: " + score); // +2 output correct score
		scan.close();
	}
}
