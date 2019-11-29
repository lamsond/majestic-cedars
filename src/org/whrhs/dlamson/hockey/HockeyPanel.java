package org.whrhs.dlamson.hockey;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HockeyPanel extends JPanel implements Runnable{
	
	public static final int MARGIN = 50;
	public static final int LENGTH = Ice.LENGTH + 2*MARGIN;
	public static final int WIDTH = Ice.WIDTH + 3*MARGIN;
	private static final int DELAY = 10;
	
	private Thread animator;
	private Ice ice;
	private Goal goal;
	private Puck puck;
	
	public HockeyPanel() {
		ice = new Ice();
		goal = new Goal();
		puck = new Puck(MARGIN, MARGIN);
		
		setPreferredSize(new Dimension(LENGTH, WIDTH));
		setBackground(Color.WHITE);
	}
	
	@Override
	public void addNotify() {
		super.addNotify();
		animator = new Thread(this);
		animator.start();
	}
	
	@Override
	public void run() {
		long beforeTime, timeDiff, sleep;
		
		beforeTime = System.currentTimeMillis();
		
		while(true) {
			puck.move();
			repaint();
			
			timeDiff = System.currentTimeMillis() - beforeTime;
			sleep = DELAY - timeDiff;
			
			if(sleep < 0) sleep = 2;
			
			try {
				Thread.sleep(sleep);
			}
			catch(InterruptedException e) {
				String msg = String.format("Thread interrupted: %s",  e.getMessage());
				
				JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			beforeTime = System.currentTimeMillis();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		ice.draw(g2d, MARGIN, MARGIN);
		goal.draw(g2d,  MARGIN, MARGIN, true);
		goal.draw(g2d, MARGIN, MARGIN, false);
		puck.draw(g2d, Color.BLACK);
	}
}
