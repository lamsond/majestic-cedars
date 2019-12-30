package org.whrhs.dlamson.csa.u4.frq;

public class Circle {

	private int x, y, radius;
	private static int numCircles;
	public static final int CANVAS_WIDTH = 500, CANVAS_HEIGHT = 500;
	
	public Circle(int r) {
		x = CANVAS_WIDTH/2;
		y = CANVAS_HEIGHT/2;
		radius = r;
		numCircles++;
	}
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		radius = r;
		numCircles++;
	}
	
	public double calcArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public double calcPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public boolean isOverlapping(Circle c) {
		double d = Math.sqrt(Math.pow(c.x - this.x, 2) + Math.pow(c.y - this.y, 2));
		return d < this.radius + c.radius;
	}
	
}
