package org.whrhs.dlamson.hockey.physics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class CircularRinkPanel extends JPanel implements Runnable{

	public static final int DIM = 500;
	public static final int RAD = 220;
	public static final int PUCK_RAD = 4;
	private static final int DELAY = 15;
	private Thread animator;
	private double x, y;
	private double[] unitVector = new double[2];
	private int theta;
	
	public CircularRinkPanel() {
		setPreferredSize(new Dimension(DIM, DIM));
		setBackground(Color.WHITE);
		theta = 5;
		setUnitVector();
		x = 100;
		y = 100;
	}
	
	@Override
	public void addNotify() {
		super.addNotify();
		animator = new Thread(this);
		animator.start();
	}
	
	@Override
	public void run() {
		long before, diff, sleep;
		
		before = System.currentTimeMillis();
		while(true) {
			move();
			repaint();
			
			diff = System.currentTimeMillis() - before;
			sleep = DELAY - diff;
			
			if(sleep < 0)
				sleep = 2;
			
			try {
				Thread.sleep(sleep);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			
			before = System.currentTimeMillis();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		g2.setStroke(new BasicStroke(3));
		g2.drawArc(10,  10,  2*RAD, 2*RAD, 0, 360);
		g2.setColor(Color.PINK);
		g2.fillArc((int)x-PUCK_RAD, (int)y-PUCK_RAD, 2*PUCK_RAD, 2*PUCK_RAD, 0, 360);
	}
	
	private void setUnitVector() {
		unitVector[0] = Math.cos(theta*2*Math.PI/360);
		unitVector[1] = Math.sin(theta*2*Math.PI/360);
	}
	
	public void move() {
		if(Math.pow((x-RAD+10), 2) + Math.pow((y-RAD+10), 2) >= RAD*RAD) {
			theta = 180 - theta;
			setUnitVector();
		}
		x += unitVector[0];
		y += unitVector[1];
	}
	
	
}
