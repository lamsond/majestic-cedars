package org.whrhs.dlamson.csa.ex.wk3;

import java.util.ArrayList;

public class Tuner {
	
	public static final String[] NOTES = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
	private static ArrayList<Double> frequencies = new ArrayList<>(); 
	
	public static void calculateFrequencies(double aNote) {
		frequencies.add(aNote);
		for(int i = 1; i < NOTES.length; i++) {
			frequencies.add(frequencies.get(i-1) * Math.pow(2, (double)1/12));
		}
		System.out.println(frequencies);
	}
	
	public static double getFrequency(String note) {
		for(int i = 0; i < NOTES.length; i++) {
			if(note.equals(NOTES[i])) {
				return frequencies.get(i);
			}
		}
		return -1;
	}
	
	public static boolean inTune(String note, double frequency) {
		double target = getFrequency(note);
		return Math.abs(frequency - target) < 0.004 * target;
	}
	
	public static void main(String[] args) {
		calculateFrequencies(440.0);
		System.out.println(getFrequency("G"));
		System.out.println(inTune("G", 784));
	}

}
