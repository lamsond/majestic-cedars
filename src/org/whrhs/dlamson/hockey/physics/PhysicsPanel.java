package org.whrhs.dlamson.hockey.physics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PhysicsPanel extends JPanel{
	
	public static final int W = 500;
	public static final int H = 500;
	private Vector v;
	
	public PhysicsPanel() {
		v = new Vector(1, 2);
		setPreferredSize(new Dimension(W, H));
		setBackground(new Color(153, 202, 252));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		v.drawVector(g2,  W/2, H/2);
	}
}
