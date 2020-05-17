package org.whrhs.dlamson.csa.u10.l1;

public class UnitTen {

	public static int pizza(int n) {
		if(n == 1) {
			return 1;
		}
		return 2*n + pizza(n-1) - 1;
	
	}
	
	public static void lasagna() {
		System.out.println("lasagna");
		lasagna();
		System.out.println("pizza");
	}
	
	public static void main(String[] args) {
		System.out.println(pizza(12));
	}
	
}
