package org.whrhs.dlamson.csa.u7.l4;

import java.awt.Color;
import java.awt.Graphics2D;

public class Card {
	
	public static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	public static final char[] SUITES = {'\u2660', '\u2665', '\u2666', '\u2663'};
	private String rank;
	private char suite;
	private Color color;
	
	public Card() {
		rank = RANKS[(int)(RANKS.length * Math.random())];
		suite = SUITES[(int)(SUITES.length * Math.random())];
		color = suite == '\u2660' || suite == '\u2665' ? Color.BLACK: Color.red;
	}
	
	public void renderCard(Graphics2D g) {
		
	}

}
