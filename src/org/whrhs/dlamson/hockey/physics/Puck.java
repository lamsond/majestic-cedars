package org.whrhs.dlamson.hockey.physics;

import java.awt.Color;
import java.awt.Graphics2D;

public class Puck {

	public static final int PUCK_RAD = 10;
	public Vector uv;
	public int x, y, speed;
	
	public Puck(int x, int y) {
		this.x = x;
		this.y = y;
		int randDeg = (int)(Math.random()*360);
		this.uv = Vector.unitNorm(randDeg);
		this.speed = 5;
	}
	
	public void move() {
		this.x += uv.x * speed;
		this.y += uv.y * speed;
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillOval(x-10, y-10, PUCK_RAD, PUCK_RAD);
	}
}
