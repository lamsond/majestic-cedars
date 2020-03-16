package org.whrhs.dlamson.csa.u9.l3;

import java.awt.Graphics;

abstract class Sprite {

	int[] pos;
	
	public Sprite() {
		pos = new int[2];
	}
	
	public Sprite(int x, int y) {
		pos = new int[]{x, y};
	}
	
	abstract void render(Graphics g);
}
