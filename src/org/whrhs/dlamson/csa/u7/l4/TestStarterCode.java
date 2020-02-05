package org.whrhs.dlamson.csa.u7.l4;

import java.util.ArrayList;

public class TestStarterCode {

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
		names.add("Daniel");
		names.add("Saad");
		names.add("Rishab");
		names.add("Christian");
		names.add("Zach");
		names.add("Abby");
		names.add("Justine");
		names.add("Adam");
		names.add("Anthony");
		names.add("Bill");
		names.add("Ariha");
		names.add("Inica");
		names.add("Adithi");
		names.add("Tony");
		names.add("Charlotte");
		names.add("Leo");
		names.add("Anthony");
		names.add("Toby");
		names.add("Spencer");
		names.add("Cullen");
		names.add("Shane");
		
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
