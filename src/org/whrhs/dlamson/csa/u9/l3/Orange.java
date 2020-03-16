package org.whrhs.dlamson.csa.u9.l3;

import java.awt.Color;
import java.awt.Graphics;

public class Orange extends Fruit{

	public Orange(int x, int y) {
		super(x, y);
		value = 20;
	}
	
	@Override
	public void render(Graphics g) {
		if(visible) {
			g.setColor(Color.ORANGE);
			g.fillOval(pos[0], pos[1], Fruit.RAD*3, Fruit.RAD*3);
		}
	}
}
