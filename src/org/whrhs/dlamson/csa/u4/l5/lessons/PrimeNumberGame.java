2package org.whrhs.dlamson.csa.u4.l5.lessons;

import java.util.Scanner;

public class PrimeNumberGame {

	public Scanner scan = new Scanner(System.in);
	
	public boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] pizza) {
		int score = 0;
		int prime = 1;
		int previous = 1;
		PrimeNumberGame game = new PrimeNumberGame();
		
		while(true) {
			
			System.out.print("Enter a prime greater than " + previous + ": ");
			String input = game.scan.nextLine();
			prime = Integer.parseInt(input);
			if(!game.isPrime(prime) || prime <= previous) {
				System.out.println("\nGame Over!");
				break;
			}
			previous = prime;
			score++;
			System.out.println("Score = " + score + "\n");
		}
		
		System.out.println("Final Score = " + score);
		game.scan.close();
	}
}
