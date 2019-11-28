package org.whrhs.dlamson.hockey;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

public class Ice {
	
	// scale factor
	public static final int SF = 5;
	
	// dimensions
	public static final int LENGTH = 200*SF;
	public static final int WIDTH = 85*SF;
	public static final int RAD = 28*SF;
	public static final int NEUTRAL_ZONE_LENGTH = 50*SF;
	public static final int BACKLINE_LENGTH = 11*SF;
	
	public Ice() {
		
	}
	
	public void drawIce(Graphics2D g, int xOffset, int yOffset) {
		g.setColor(Color.RED);
		g.setStroke(new BasicStroke(2));
		g.drawLine((int)(LENGTH/2) + xOffset, yOffset, (int)(LENGTH/2) + xOffset, WIDTH + yOffset);
		g.drawLine(BACKLINE_LENGTH + xOffset, yOffset, BACKLINE_LENGTH + xOffset, WIDTH + yOffset);
		g.drawLine(LENGTH-BACKLINE_LENGTH + xOffset, yOffset, LENGTH-BACKLINE_LENGTH + xOffset, WIDTH + yOffset);
		
		g.setColor(Color.BLUE);
		g.drawLine((int)(LENGTH/2) - NEUTRAL_ZONE_LENGTH/2 + xOffset, yOffset, (int)(LENGTH/2) - NEUTRAL_ZONE_LENGTH/2 + xOffset, WIDTH + yOffset);
		g.drawLine((int)(LENGTH/2) + NEUTRAL_ZONE_LENGTH/2 + xOffset, yOffset, (int)(LENGTH/2) + NEUTRAL_ZONE_LENGTH/2 + xOffset, WIDTH + yOffset);
		
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(3));
		g.draw(new RoundRectangle2D.Double(xOffset, yOffset, LENGTH, WIDTH, RAD, RAD));
	}
	
}
