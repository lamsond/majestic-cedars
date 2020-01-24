package org.whrhs.dlamson.csa.u7.l2;

import java.util.ArrayList;
// import java.util.Arrays;

public class ArrListLoops {
	
	public static void removeAllOccurances(ArrayList<Integer> list, int valueToRemove){
	    for(int i = 0; i < list.size(); i++){
	        if(list.get(i) == valueToRemove){
	            list.remove(i);
	            i--;
	        }
	    }
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> scores = new ArrayList<>();
		// add any values you want to this array
		scores.add(13);
		scores.add(13);
		scores.add(13);
		scores.add(13);
		scores.add(13);
		
		System.out.println("Before: " + scores);
		
		removeAllOccurances(scores, 13);
		
		System.out.println("After: " + scores);
		
	}

}
