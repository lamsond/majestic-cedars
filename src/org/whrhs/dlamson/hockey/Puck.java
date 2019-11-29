package org.whrhs.dlamson.hockey;

import java.awt.Color;
import java.awt.Graphics2D;

public class Puck {

	public static final int PUCK_DIAMETER = Math.max((int)(Ice.SF/4), 7);
	private int x, y, speed;
	private double[] vector;
	
	public Puck(int xOffset, int yOffset) {
		x = Ice.LENGTH/2 + xOffset;
		y = Ice.WIDTH/2 + yOffset;
		speed = 3;
		vector = new double[]{1.0, 0.0};
	}
	
	public void draw(Graphics2D g, Color c) {
		g.setColor(c);
		g.fillArc(x - PUCK_DIAMETER/2,  y - PUCK_DIAMETER/2,  PUCK_DIAMETER,  PUCK_DIAMETER, 0, 360);
	}
}
