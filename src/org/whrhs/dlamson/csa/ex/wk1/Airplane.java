package org.whrhs.dlamson.csa.ex.wk1;

import java.util.ArrayList;

public class Airplane {
	
	private String carrier;
	private int monthLastMaintained;
	private int yearLastMaintained;
	private ArrayList<Flight> flights;
	
	public Airplane(String c, int m, int y) {
		carrier = c;
		monthLastMaintained = m;
		yearLastMaintained = y;
		flights = new ArrayList<>();
	}
	
	public void addFlight(Flight f) {
		flights.add(f);
	}
	
	public int getMonthMaintained() {
		return monthLastMaintained;
	}
	
	public int getYearMaintained() {
		return yearLastMaintained;
	}
	
	public String getCarrier() {
		return carrier;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// PART A
	
	public boolean maintenanceNeeded(int currMonth, int currYear) {
		
		int currTotal = currYear * 12 + currMonth;
		int maintTotal = yearLastMaintained * 12 + monthLastMaintained;
		
		if(currTotal - maintTotal > 12) {
			return true;
		}
		
		for(int i = flights.size() - 1; i >= 0 && i > flights.size() - 4; i--) {
			if(flights.get(i).hasMechanicalIssue()) {
				return true;
			}
		}
		
		return false;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
