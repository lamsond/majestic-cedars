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
		speed = 5;
		vector = new double[2];
		randomUnitVector();
	}
	
	public void draw(Graphics2D g, Color c) {
		g.setColor(c);
		g.fillArc(x - PUCK_DIAMETER/2,  y - PUCK_DIAMETER/2,  PUCK_DIAMETER,  PUCK_DIAMETER, 0, 360);
	}
	
	public void move() {
		x += (int)(vector[0] * speed);
		y += (int)(vector[1] * speed);
		if(x > Ice.LENGTH + HockeyPanel.MARGIN || x < HockeyPanel.MARGIN)
			vector[0] *= -1;
		if(y < HockeyPanel.MARGIN || y > Ice.WIDTH + HockeyPanel.MARGIN)
			vector[1] *= -1;
	}
	
	private void randomUnitVector() {
		double rad = 2*Math.PI*Math.random();
		vector[0] = Math.cos(rad);
		vector[1] = Math.sin(rad);
	}
}