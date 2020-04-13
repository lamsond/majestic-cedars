package org.whrhs.dlamson.csa.piday;

public class Ariha {
	
	public static void main (String[] args)
	{
		double x = 1;
		double pi = 0;
		int time = 1;
		while (true)
		{
			if (time%2 != 0)
			{
				pi += 1/x;
			}
			else
			{
				pi -=1/x;
			}
			System.out.println(pi*4);
			System.out.println(Math.PI);
			System.out.println();
			x+=2;
			time++;
		}
		
		
	}
}
