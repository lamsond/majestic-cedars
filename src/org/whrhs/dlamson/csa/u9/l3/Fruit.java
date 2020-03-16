package org.whrhs.dlamson.csa.u9.l3;

abstract class Fruit extends Sprite {
	
	public static final int RAD = 30;
	
	int value;
	boolean visible;
	
	public Fruit(int x,  int y) {
		super(x, y);
		visible = true;
	}

}
