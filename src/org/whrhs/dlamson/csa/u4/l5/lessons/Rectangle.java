package org.whrhs.dlamson.csa.u4.l5.lessons;

public class Rectangle {

	private int x, y, width, height;
	
	public Rectangle(int w, int h) {
		x = 0;
		y = 0;
		width = w;
		height = h;
	}
	
	public int findArea() {
		return width * height;
	}
	
	public static void main(String[] pizza) {
		Rectangle rect1 = new Rectangle(100, 200);
		Rectangle rect2 = new Rectangle(50, 80);
		System.out.println(rect1.findArea());
		System.out.println(rect1);
	}
}
