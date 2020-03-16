package org.whrhs.dlamson.csa.u9.l3;

import java.awt.Color;
import java.awt.Graphics;

public class Banana extends Fruit {

	public Banana(int x, int y) {
		super(x, y);
		value = 10;
	}
	
	@Override
	public void render(Graphics g) {
		if(visible) {
			g.setColor(Color.YELLOW);
			g.fillOval(pos[0], pos[1], Fruit.RAD*4, Fruit.RAD*4);
			g.setColor(Color.BLACK);
			g.fillOval(pos[0]+30, pos[1], Fruit.RAD*4, Fruit.RAD*4);
		}
	}
}
