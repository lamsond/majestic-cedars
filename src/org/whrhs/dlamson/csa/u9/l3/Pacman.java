package org.whrhs.dlamson.csa.u9.l3;

import java.awt.Color;
import java.awt.Graphics;

public class Pacman extends Sprite {

	public static final int RAD = 50;
	public static final int SPEED = 2;
	private int points;
	private int theta;
	
	public Pacman(int x, int y) {
		super(x, y);
		points = 0;
		theta = 35;
	}
	
	public void eat(Fruit f) {
		if(pos[0]+1.5*RAD >= f.pos[0]) {
			if(f.visible) {
				points += f.value;
				f.visible = false;
			}
		}
	}
	
	public void move() {
		pos[0] += SPEED;
	}
	
	
	@Override
	public void render(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillArc(pos[0], pos[1], RAD*2, RAD*2, theta, 360 - 2*theta);
	}
	
	public int getTheta() {
		return theta;
	}
	
	public void setTheta(int t) {
		theta = t;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int p) {
		points = p;
	}
}
