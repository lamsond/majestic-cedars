package org.whrhs.dlamson.csa.ex.realDeal;

import java.util.ArrayList;

public class Stats {
	private ArrayList<ScoreInfo> scoreList = new ArrayList<>();
	
	public boolean record(int score) {
		for(int i = 0; i < scoreList.size(); i++) {
			if(score < scoreList.get(i).getScore()) {
				scoreList.add(i, new ScoreInfo(score));
				return true;
			}
			else if(scoreList.get(i).getScore() == score) {
				scoreList.get(i).increment();
				break;
			}
		}
		return false;
	}
	
	public void recordScores(int[] scores) {
		for(int score: scores) {
			this.record(score);
		}
	}
}
