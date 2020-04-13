package org.whrhs.dlamson.csa.piday;

import java.util.Scanner;
public class Ivan
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of interations");
		int max = scan.nextInt();
		double b = -3;
		double current = 1;
		for(int i = 0; i < max; i++)
		{
			current+=1/b;
			System.out.println("Trial " + (i+1));
			System.out.println(4*current);
			System.out.println(Math.PI);
			b*=-1;
			if(b < 0)
				b-=2;
			if(b > 0)
				b+=2;
		}
	}
}
