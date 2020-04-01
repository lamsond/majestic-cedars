package org.whrhs.dlamson.csa.ex.wk1;

import java.util.List;
import java.util.ArrayList;

public class SkiResort {

	String name;
	SkiingActivity[] log;
	
	public SkiResort(String name) {
		this.name = name;
		log = new SkiingActivity[5];
	}
	
	public String getResortName() {
		return name;
	}
	
	public SkiingActivity[] getSkiLog() {
		return log;
	}
	
	public List<SkiSlope> getSlopes() {
		List<SkiSlope> slopes = new ArrayList<>();
		return slopes;
	}
	
	public Skier[] getSkiers() {
		Skier[] skierList = new Skier[5];
		return skierList;
	}
	
	public SkiSlope getSkiSlope(String slopeName) {
		return new SkiSlope("Your Mom", 4);
	}
	
	
	// PART A
	
	
	
	public void updateSkiSlopes() {
		SkiingActivity[] log = getSkiLog();
		for(SkiingActivity activity: log) {
			SkiSlope slope = getSkiSlope(activity.getSlopeName());
			slope.setNumDailySkiers(slope.getNumDailySkiers() + 1);
		}
	}
	
	// PART B
	
	/*
	 * Get array of Skier objects
	 * Get activity log
	 * Check if skier name matches name in activity log
	 * Get SkiSlope object
	 * setNumRuns by getting and adding 1
	 * setScore by getting and adding Slope difficulty
	 * 
	 */
	
	public void updateSkiers() {
		Skier[] skiers = getSkiers();
		SkiingActivity[] log = getSkiLog();
		
		for(int i = 0; i < skiers.length; i++) {
			for(SkiingActivity activity: log) {
				if(activity.getSkierName().equals(skiers[i].getName())) {
					SkiSlope slope = getSkiSlope(activity.getSlopeName());
					skiers[i].setNumRuns(skiers[i].getNumRuns()+1);
					skiers[i].setScore(skiers[i].getScore() + slope.getDifficulty());
				}
			}
		}

	}
	
}
