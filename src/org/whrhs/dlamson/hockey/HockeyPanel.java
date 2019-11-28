package org.whrhs.dlamson.hockey;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class HockeyPanel extends JPanel{
	
	public static final int MARGIN = 10;
	public static final int LENGTH = Ice.LENGTH + 4*MARGIN;
	public static final int WIDTH = Ice.WIDTH + 6*MARGIN;
	
	private Ice ice;
	
	public HockeyPanel() {
		ice = new Ice();
		setPreferredSize(new Dimension(LENGTH, WIDTH));
		setBackground(Color.WHITE);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		ice.drawIce(g2d, MARGIN, MARGIN);
	}
}
