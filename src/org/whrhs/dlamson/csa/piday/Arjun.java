package org.whrhs.dlamson.csa.piday;

public class Arjun {

    public static void main(String[] args) {
      double pi = 0;
      double denom = 1;
 
      for (int i = 0; i < 10000000; i++) {
         if (i % 2 == 0) {
            pi += (1 / denom);
         } else {
            pi -= (1 / denom);
         }
         denom += 2;
	 System.out.println("Leibniz Approximation: " + pi * 4);
	 System.out.println("Real PI:               " + Math.PI);
	 System.out.println("");
	 try {
	     Thread.sleep(250);
	 } catch (Exception e) {} 
      }
   }
}
