package org.whrhs.dlamson.csa.ex.wk4;

public class APCalendar {
	
	private static boolean isLeapYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
	
	/** Returns the number of leap years between year1 and year2, inclusive.
	 * Precondition: 0 <= year1 <= year2
	 */ 
	public static int numberOfLeapYears(int year1, int year2) {
		int count = 0;
		for(int year = year1; year <= year2; year++) {
			if(isLeapYear(year)) {
				count++;
			}
		}
		return count;
	}
	
	private static int firstDayOfYear(int year) {
		return 0;
	}
	
	private static int dayOfYear(int month, int day, int year) {
		return 31;
	}
	
	public static int dayOfWeek(int month, int day, int year) {
		int firstDayOfYear = firstDayOfYear(year);
		int dayOfYear = dayOfYear(month, day, year);
		
		return (firstDayOfYear + dayOfYear - 1) % 7; 
	}
	
	public static void main(String[] args) {
		
		System.out.println(dayOfWeek(2, 1, 2020));
	}

}
