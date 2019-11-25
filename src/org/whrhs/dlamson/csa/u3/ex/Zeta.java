package org.whrhs.dlamson.csa.u3.ex;

public class Zeta {
	public static void main(String[] args) {
		for(int i = 1; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				if(j % i == 0) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		int n = -5;
		if(n % 5 != 0)
			n *= -1;
		if(n > 0)
			if(n >= 5)
				System.out.print(1);
			else
				System.out.print(2);
		else
			System.out.print(3);
		System.out.print(4);
		
		double x = -0.2;
		double y = x / 3;
		System.out.println("\n" + (y * 3 - x < 0.0001));
	}
}
