package org.whrhs.dlamson.csa.ex.wk1;

public class SkiingActivity {

	private String slopeName;
	private String skierName;
	
	public SkiingActivity(String slopeName, String skierName) {
		this.slopeName = slopeName;
		this.skierName = skierName;
	}
	
	public String getSlopeName() {
		return slopeName;
	}
	
	public String getSkierName() {
		return skierName;
	}
	
}
