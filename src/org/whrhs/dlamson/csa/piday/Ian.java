package org.whrhs.dlamson.csa.piday;
import java.util.Scanner;

public class Ian {
    public static void main(String[]args) 
    {
    Scanner Reader = new Scanner(System.in);
    
    int input;
    
     System.out.print("Enter the number of iterations:");
     input = Reader.nextInt(); // set input as the input
     
   
    double output = 0.0;
    boolean positive = true; // don't know this
    
    for (int i=0; i<input; i++) { 
        double sum = 1.0/(2.0*((double)i) + 1.0); //how no idea how this works
        if (positive) 
        output += sum; //same as output = output + sum
        else 
            output -= sum; // same as output = output = output - sum
            positive = !positive; // Don't know this
}
        System.out.println("Pi/4 is " + output);
}
}