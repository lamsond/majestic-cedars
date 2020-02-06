package org.whrhs.dlamson.csa.u7.l4;

import java.util.ArrayList;

public class SortAlgs {

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
				String temp = list.remove(i);
				list.add(insertIndex, temp);
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
		
		System.out.println("Shuffle Test: ");
		printList(shuffleTest);
		System.out.println("Sort Test: ");
		printList(sortTest);
	
	}
}
