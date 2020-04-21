package org.whrhs.dlamson.csa.ex.wk3;

import java.util.ArrayList;

public class Tuner {
	
	public static final String[] NOTES = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
	private ArrayList<Double> frequencies = new ArrayList<>(); 
	private double aNote;
	
	/* constructs a tuner object by setting the frequency of the aNote and
	 * and initializing the frequencies list based on the starting freqency of
	 * the A note.
	 */
	public Tuner(double aNote) {
		/* to be implemented in part (a) */
	}
	
	/* returns the frequency corresponding to a given note. Return -1.0 if the note
	 * is not found in the NOTES array
	 */
	public double getFrequency(String note) {
		/* to be implemented in part(b) */
		return 0.0;
	}
	
	/* returns whether or not a given frequency is in in tune or not */
	public boolean inTune(String note, double frequency) {
		/* to be implemented in part(c) */
		return false;
	}
	
}
