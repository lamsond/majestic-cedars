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
		List<SkiSlope> slopes = getSlopes();
		SkiingActivity[] log = getSkiLog();
		
		for(SkiSlope slope: slopes) {
			int count = 0;
			for(SkiingActivity entry: log) {
				if(slope.getName().equals(entry.getSlopeName())) {
					count++;
				}
			}
			slope.setNumDailySkiers(count);
		}
		
	}
	
	// PART B
	
	
	
	public void updateSkiers() {

		Skier[] skiers = getSkiers();
		SkiingActivity[] log = getSkiLog();
		
		for(Skier skier: skiers) {
			int count = 0;
			int score = 0;
			for(SkiingActivity entry: log) {
				if(skier.getName().equals(entry.getSkierName())) {
					count++;
					String slopeName = entry.getSlopeName();
					SkiSlope slope = getSkiSlope(slopeName);
					int difficulty = slope.getDifficulty();
					score += difficulty;
				}
			}
			skier.setNumRuns(count);
			skier.setScore(score);
		}

	}
	
}
