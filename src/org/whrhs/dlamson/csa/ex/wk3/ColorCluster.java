package org.whrhs.dlamson.csa.ex.wk3;

import java.util.Arrays;

public class ColorCluster {
	
	public static final int N = 20;
	double[] hues;
	
	public ColorCluster() {
		hues = new double[N];
		for(int i = 0; i < N; i++) {
			hues[i] = Math.random()*360;
		}
		Arrays.sort(hues);
	}
	
	public int getInSpec(int spec, int range) {
		int count = 0;
		int min = spec - range;
		int max = spec + range;
		for(int i = 0; i < hues.length; i++) {
			if(hues[i] >= min) {
				if(hues[i] <= max) {
					count++;
				}
				else {
					return count;
				}
			}
		}
		return count;
	}
	
	public int findOptimalColor(int range) {
		int maxCount = getInSpec(0, range);
		int optimalHue = 0;
		for(int hue = 1; hue < 360; hue++) {
			if(getInSpec(hue, range) > maxCount) {
				maxCount = getInSpec(hue, range);
				optimalHue = hue;
			}
		}
		System.out.println("In Spec = " + maxCount);
		return optimalHue;
	}
	
	public static void main(String[] args) {
		ColorCluster cluster = new ColorCluster();
		System.out.println(Arrays.toString(cluster.hues));
		System.out.println("Optimal Hue: " + cluster.findOptimalColor(5));
	}
	
}
