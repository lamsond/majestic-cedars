package org.whrhs.dlamson.csa.ex.wk1;

public class SkiSlope {
	
	private String name;
	private int difficulty;
	private int numDailySkiers;

	public SkiSlope(String name, int difficulty) {
		this.name = name;
		this.difficulty = difficulty;
		numDailySkiers = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDifficulty() {
		return difficulty;
	}
	
	public int getNumDailySkiers() {
		return numDailySkiers;
	}
	
	public void setNumDailySkiers(int numSkiers) {
		numDailySkiers = numSkiers;
	}
}
