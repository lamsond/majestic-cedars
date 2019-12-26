package org.whrhs.dlamson.hockey.physics;

import java.awt.Graphics2D;

public class Vector {
	
	public static final int SF = 10;
	public double x, y;

	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double norm() {
		return Math.sqrt(x*x + y*y);
	}
	
	public Vector unitNorm() {
		Vector v = new Vector(x/this.norm(), y/this.norm());
		return v;
	}
	
	public static Vector unitNorm(double theta) {
		Vector v = new Vector(Math.cos(theta*2*Math.PI/180), Math.sin(theta*2*Math.PI/180));
		return v;
	}
	
	public void drawVector(Graphics2D g, int x0, int y0) {
		int x1 = (int) (x * SF);
		int y1 = (int) (y * SF);
		g.drawLine(x0,  y0,  x0 + x1, y0 + y1);
		g.drawLine(x0 + x1, y0 + y1, (int)(x1 - Math.cos(Math.PI/8)), (int)(y1 - Math.sin(Math.PI/8)));
		g.drawLine(x0 + x1, y0 + y1, (int)(x1 - Math.cos(Math.PI/8)), (int)(y1 + Math.sin(Math.PI/8)));
	}
}
