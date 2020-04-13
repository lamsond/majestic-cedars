package org.whrhs.dlamson.csa.piday;

public class Tony {

	
	public static void main(String [] args) { 
		
		
		double c = 1.0; 
		boolean t = true; 
		double x = 3.0; 
		int counter = 1; 
		while(t) { 
			
			if(counter%2 == 0) { 
				c+= (1/x);
			}
			else {
				c-=(1/x); 
			}
			x+=2; 
			counter++; 
			System.out.println(4*c); 
	
		}
		
		
		
		
	}
}