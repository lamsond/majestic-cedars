package org.whrhs.dlamson.ocp.ex.post.q35;

public class BreakSwitch {

	public static void main(String[] args) {
		System.out.println("Demo Program Notes: Odd Numbers won't break");
		System.out.println("\tEven numbers will");
		System.out.println("\tRandomly select a number between 0 and 10, \n\tanything over 5 will be default");
		
		int n = (int)(Math.random() * 10);
		System.out.println("n is " + n);
		
		switch(n) {
		case 0:
			System.out.println("case 0");
			break;
		case 1:
			System.out.println("case 1");
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
		case 4:
			System.out.println("case 4");
			break;
		case 5:
			System.out.println("case 5");
		default:
			System.out.println("case default");
		}
	}
}
