package org.whrhs.dlamson.hockey.physics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Rink {

	public static final int RINK_RAD = 200;
	public int[] center = {RINK_RAD, RINK_RAD};
	
	public void draw(Graphics2D g) {
		g.setColor(Color.CYAN);
		g.setStroke(new BasicStroke(5));
		g.drawOval(0, 0, RINK_RAD*2, RINK_RAD*2);
	}
	
	public boolean puckHitWall(int x, int y) {
		return true;
	}
}
