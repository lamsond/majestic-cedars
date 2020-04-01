package org.whrhs.dlamson.csa.ex.wk1;

import java.util.ArrayList;

public class Airplane {
	
	private String carrier;
	private int lastMonthMaintained;
	private int lastYearMaintained;
	private ArrayList<Flight> flights;
	
	public Airplane(String c, int m, int y) {
		carrier = c;
		lastMonthMaintained = m;
		lastYearMaintained = y;
		flights = new ArrayList<>();
	}
	
	public void addFlight(Flight f) {
		flights.add(f);
	}
	
	public int getMonthMaintained() {
		return lastMonthMaintained;
	}
	
	public int getYearMaintained() {
		return lastYearMaintained;
	}
	
	public String getCarrier() {
		return carrier;
	}
	
	// PART A
	
	public boolean maintenanceNeeded(int currMonth, int currYear) {
		int currTotal = currYear * 12 + currMonth;
		int maintTotal = lastYearMaintained * 12 + lastMonthMaintained;
		
		if(currTotal - maintTotal > 12) {
			return true;
		}
		
		for(int i = flights.size() - 1; i > 0; i++) {
			if(flights.get(i).hasMechanicalIssue()) {
				return true;
			}
			if(i == flights.size() - 3) {
				break;
			}
		}
		
		return true;
	}
	
}
