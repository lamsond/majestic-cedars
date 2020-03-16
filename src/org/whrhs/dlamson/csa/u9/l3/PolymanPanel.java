package org.whrhs.dlamson.csa.u9.l3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class PolymanPanel extends JPanel implements ActionListener{
	
	public static final int H = 300;
	public static final int W = 1000;
	private Pacman pac;
	private Timer timer;
	private Font f;
	boolean openMouth;
	// declare fruit here
	private Fruit[] fruits;

	public PolymanPanel() {
		int x = 200;
		// initialize fruit here
		fruits = new Fruit[8];
		for(int i= 0; i < fruits.length; i++) {
			fruits[i] = getRandomFruit(x, 125);
			x += 100;
		}
		
		pac = new Pacman(30, 125);
		setSize(W, H);
		setBackground(Color.BLACK);	
		timer = new Timer(10, this);
		timer.restart();
		openMouth = false;
		f = new Font("Courier", Font.PLAIN, 36);
	}
	
	public Fruit getRandomFruit(int x, int y) {
		int rand = (int) (Math.random() * 3);
		if(rand == 0) {
			return new Cherries(x, y);
		}
		else if(rand == 1) {
			return new Banana(x, y);
		}
		return new Orange(x, y);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// draw fruit and eat them here
		for(Fruit fruit: fruits) {
			pac.eat(fruit);
			fruit.render(g);
		}
	
		
		pac.render(g);
		g.setColor(Color.WHITE);
		g.setFont(f);
		g.drawString("Points: " + pac.getPoints(), 10, 35);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		openMouth = pac.getTheta() <= 0 || pac.getTheta() > 35 ? !openMouth:openMouth;
		pac.setTheta(openMouth ? pac.getTheta() + Pacman.SPEED:pac.getTheta() - Pacman.SPEED);
		pac.move();
		repaint();
	}
}
