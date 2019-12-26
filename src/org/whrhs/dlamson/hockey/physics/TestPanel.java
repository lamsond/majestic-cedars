package org.whrhs.dlamson.hockey.physics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class TestPanel extends JPanel implements Runnable{
	
	public static final int DELAY = 25;
	private Rink r;
	private Puck p;
	private Thread animator;
	
	public TestPanel() {
		r = new Rink();
		p = new Puck(50, 50);
		
		setPreferredSize(new Dimension(500, 500));
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
		long before, diff, sleep;
		before = System.currentTimeMillis();
		
		while(true) {
			p.move();
			repaint();
			
			diff = System.currentTimeMillis() - before;
			sleep = DELAY - diff;
			
			if(sleep < 0)
				sleep = 2;
			
			try {
				Thread.sleep(sleep);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			
			before = System.currentTimeMillis();
		}
	}
	
	@Override
	public void paintComponent(Graphics g1) {
		super.paintComponent(g1);
		Graphics2D g = (Graphics2D) g1;
		r.draw(g);
		p.draw(g);
	}
	
	

}
