package org.whrhs.dlamson.csa.piday;

public class Ally {
	public static void main(String[] args){
		
		int n = 1000;
		double sum = 0;
		for (int i=0; i<n; i++) {
			double element = Math.pow(-1,i) * 1 / (1+2*i);
			sum += element;
			System.out.println(sum*4);
		}		
	}
}
