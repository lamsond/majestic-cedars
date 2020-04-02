package org.whrhs.dlamson.csa.ex.wk1;

public class Skier {
	
	private String name;
	private int numRuns;
	private int score;
	
	public Skier(String name) {
		this.name = name;
		numRuns = 0;
		score = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumRuns() {
		return numRuns;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setNumRuns(int runs) {
		numRuns = runs;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
