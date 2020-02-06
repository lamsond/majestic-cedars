package org.whrhs.dlamson.csa.u7.l4;

import java.util.ArrayList;

public class SortAlgsPer1 {

	public static void selectionSort(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++) {
			int minIndex = i;
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(j).compareTo(list.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				String temp = list.get(i);
				list.set(i, list.get(minIndex));
				list.set(minIndex, temp);
			}
		}
	}
	
	public static void insertionSort(ArrayList<String> list) {
		for(int i = 1; i < list.size(); i++) {
			int insertIndex = i;
			while(insertIndex > 0 && list.get(i).compareTo(list.get(insertIndex-1)) < 0) {
				insertIndex--;
			}
			if(insertIndex < i) {
				String temp = list.get(i);
				for(int j = i; j > insertIndex; j--) {
					list.set(j, list.get(j-1));
				}
				list.set(insertIndex, temp);
			}
			
		}		
	}
	
	public static void shuffle(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++) {
			int r = i + (int)(Math.random() * list.size() - i);
			String temp = list.get(i);
			list.set(i, list.get(r));
			list.set(r,  temp);
		}
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
		names.add("Jude");
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
