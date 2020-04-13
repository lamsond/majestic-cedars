package org.whrhs.dlamson.csa.piday;

public class Mike {
	
	   public static void main(String[] args) {
	 
	      int count = Integer.MAX_VALUE;
	      double pi = 0;
	      double denominator = 1;
	 
	      for (int x = 0; x < count; x++) {
	    	 
	         if (x % 2 == 0) {
	            pi = pi + (1 / denominator);
	         } else {
	            pi = pi - (1 / denominator);
	         }
	         denominator = denominator + 2;
		    
	      }
	      System.out.println("Leibnez Value of PI: " + pi * 4);
	      System.out.println("Actual Value of PI: " + Math.PI);
	   }
	}
