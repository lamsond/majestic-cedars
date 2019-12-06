/* Lab 18
 * L1: Anatomy of a Class
 * L2: Writing Constructors
 * L3: Writing Getters and Setters
 */

package org.whrhs.dlamson.csa.u4.labs;

public class Rectangle {

	public static final int MAX_WIDTH = 1000;
	public static final int MAX_HEIGHT = 500;
	public static final int MIN_DIM = 1;
	public static final int DEFAULT_VAL = 153;
	
	private int x, y, width, height;
	
	public Rectangle() {
		x = 0;
		y = 0;
		width = DEFAULT_VAL;
		height = DEFAULT_VAL;
	}
	
	public Rectangle(int dim) {
		x = 0;
		y = 0;
		validateDims(dim, dim);
	}
	
	public Rectangle(int w, int h) {
		x = 0;
		y = 0;
		validateDims(w, h);
	}
	
	public Rectangle(int xInit, int yInit, int w, int h) {
		x = xInit;
		y = yInit;
		validateDims(w, h);
	}
	
	private void validateDims(int w, int h) {
		if(w < MIN_DIM) {
			width = MIN_DIM;
		}
		else if(w > MAX_WIDTH) {
			width = MAX_WIDTH;
		}
		else {
			width = w;
		}
		if(h < MIN_DIM) {
			height = MIN_DIM;
		}
		else if(h > MAX_HEIGHT) {
			height = MAX_HEIGHT;
		}
		else {
			height = h;
		}
	}
	
	public int findPerimeter() {
		return 2*width + 2*height;
	}
	
	public int findArea() {
		return width * height;
	}
	
	public boolean isSameArea(Rectangle other) {
		return this.findArea() == other.findArea();
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(100, 20);
		Rectangle rect2 = new Rectangle(200, 10);
		System.out.println(rect1.isSameArea(rect2));
	}
	
}
