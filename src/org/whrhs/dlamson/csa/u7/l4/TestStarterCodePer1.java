package org.whrhs.dlamson.csa.u7.l4;

import java.util.ArrayList;

public class TestStarterCodePer1 {

	public static void selectionSort(ArrayList<String> list) {

	}
	
	public static void insertionSort(ArrayList<String> list) {
	
	}
	
	public static void shuffle(ArrayList<String> list) {

	}
	
	public static void printList(String[] list) {
		for(String item: list) {
			System.out.println(item);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int TRIALS = 3;
		String[] shuffleTest = new String[TRIALS*2];
		String[] sortTest = new String[TRIALS*2];
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Ken");
		names.add("Bryan");
		names.add("Jay");
		names.add("Felix");
		names.add("Rohit");
		names.add("Arjun");
		names.add("Ally");
		names.add("Lizzy");
		names.add("Ivan");
		names.add("Anjaneya");
		names.add("Jenna");
		names.add("Sunwoo");
		names.add("Jaden");
		names.add("Toby");
		names.add("Ian");
		names.add("Mike");
		
		for(int i = 0; i < TRIALS; i++) {
			shuffle(names);
			shuffleTest[2*i] = names.toString();
			selectionSort(names);
			sortTest[2*i] = names.toString();
			shuffle(names);
			shuffleTest[2*i+1] = names.toString();
			insertionSort(names);
			sortTest[2*i+1] = names.toString();
		}
		
		System.out.println("Shufle Test: ");
		printList(shuffleTest);
		System.out.println("Sort Test: ");
		printList(sortTest);
	
	}

}
