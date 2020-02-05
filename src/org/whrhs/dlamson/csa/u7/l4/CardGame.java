package org.whrhs.dlamson.csa.u7.l4;

import java.util.ArrayList;

public class CardGame {

	public static ArrayList<String> cards = new ArrayList<>();
	
	public static void main(String[] args) {
		for(int i = 0; i < 60; i++) {
			int ch = 0x1f0a1 + i;
			cards.add(new String(Character.toChars(ch)));
		}
		System.out.println(cards);
	}
}
