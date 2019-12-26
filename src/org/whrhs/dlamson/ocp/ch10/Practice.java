package org.whrhs.dlamson.ocp.ch10;

public class Practice {

	public static int add(int... nums) {
		int sum = 0;
		for(int num: nums) {
			sum += num;
		}
		return sum;
	}
	
	public static String purpelle(int... nums) {
		String result = "";
		for(int num: nums) {
			result += num;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int testInt = add(1, 2 , 3, 4, 5);
		System.out.println(testInt);
		
		String testStr = purpelle(1, 2, 3, 4, 5);
		System.out.println(testStr);
	}
}
