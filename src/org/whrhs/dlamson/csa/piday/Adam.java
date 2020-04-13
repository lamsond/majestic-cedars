package org.whrhs.dlamson.csa.piday;

public class Adam{
	
	public static void main (String [] args){
		double pi = 0;
		double total = 0;
		int x = 0;
		
		while (pi != Math.PI){
			
			total+= (Math.pow(-1, x))/ ((double) (2*x + 1));
			pi = total * 4;
			
			System.out.println(pi + "\n" + Math.PI + "\n");
			
			x++;
		}
	}
}
