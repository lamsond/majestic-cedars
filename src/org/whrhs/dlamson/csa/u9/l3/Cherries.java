package org.whrhs.dlamson.csa.u9.l3;

import java.awt.Color;
import java.awt.Graphics;

public class Cherries extends Fruit {
	
	public Cherries(int x, int y) {
		super(x, y);
		value = 5;
	}
	
	@Override
	public void render(Graphics g) {
		if(visible) {
			g.setColor(Color.RED);
			g.fillOval(pos[0], pos[1], Fruit.RAD*2, Fruit.RAD*2);
			g.setColor(Color.BLACK);
			g.drawOval(pos[0], pos[1], Fruit.RAD*2, Fruit.RAD*2);
			g.setColor(Color.RED);
			g.fillOval(pos[0]+15, pos[1]+25, Fruit.RAD*2, Fruit.RAD*2);
			g.setColor(Color.BLACK);
			g.drawOval(pos[0]+15, pos[1]+25, Fruit.RAD*2, Fruit.RAD*2);
			}
	}

}
