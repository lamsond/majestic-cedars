package org.whrhs.dlamson.csa.ex.wk2;

import java.util.ArrayList;

public class Delimiters {

	private String openDel;
	private String closeDel;
	
	public Delimiters(String od, String cd) {
		openDel = od;
		closeDel = cd;
	}
	
	public ArrayList<String> getDelimitersList(String[] tokens){
		ArrayList<String> result = new ArrayList<>();
		for(String token: tokens) {
			if(token.equals(openDel) || token.equals(closeDel)) {
				result.add(token);
			}
		}
		return result;
	}
	
	public boolean isBalanced(ArrayList<String> delimiters) {
		int openCount = 0;
		int closeCount = 0;
		for(String delimeter: delimiters) {
			if(delimeter.equals(openDel)) {
				openCount++;
			}
			else {
				closeCount++;
			}
			if(closeCount > openCount) {
				return true;
			}
		}
		return openCount == closeCount;
	}
}
