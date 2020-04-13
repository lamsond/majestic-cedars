package org.whrhs.dlamson.csa.piday;

public class Rishab {
	public static void main (String[] PI){
		double x = 4.0;
		double y = -3.0;
		double difference = 0.0;
		while (x != Math.PI){
			x+=(4*(1/y));
			y*=-1;

			if(y > 0){
				y+=2;
			}
			else{
				y-=2;
			}
			if(Math.PI > x){
				difference = Math.PI - x;
			}
			else{
				difference = Math.PI + x;
			}
			System.out.println(Math.PI + "(Actual) - " + x + "(Theoretical) = " + difference);
		}
	}
}
