package org.whrhs.dlamson.ocp.ch9;

public class ChapterNineEx {

	public static void printArr(int[] arr) {
		System.out.println("Length: " + arr.length);
		for(int n : arr) {
			System.out.println(n);
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		
		int[] first = new int[3];
		int[] second = {};
		int[] third = null;
		
		printArr(first);
		printArr(second);
		//printArr(third);
		
		Object[] arr = new Object[3];
		arr[0] = new int[10];
		arr[1] = new int[3][4];
		arr[2] = new Object[5];
	}
}
