package org.whrhs.dlamson.hockey;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ice {
	
	// scale factor
	public static final int SF = 4;
	
	// dimensions
	public static final int LENGTH = 200*SF;
	public static final int WIDTH = 85*SF;
	public static final int RAD = 28*SF;
	public static final int NEUTRAL_ZONE_LENGTH = 50*SF;
	public static final int BACKLINE_LENGTH = 11*SF;
	
	public Ice() {
		
	}
	
	public void drawIce(Graphics2D g) {
		g.setColor(Color.RED);
		g.drawLine((int)(LENGTH/2), 0, (int)(LENGTH/2), WIDTH);
		g.drawLine(BACKLINE_LENGTH, 0, BACKLINE_LENGTH, WIDTH);
		g.drawLine(LENGTH-BACKLINE_LENGTH, 0, LENGTH-BACKLINE_LENGTH, WIDTH);
		
		g.setColor(Color.BLUE);
		g.drawLine((int)(LENGTH/2) - NEUTRAL_ZONE_LENGTH/2, 0, (int)(LENGTH/2) - NEUTRAL_ZONE_LENGTH/2, WIDTH);
		g.drawLine((int)(LENGTH/2) + NEUTRAL_ZONE_LENGTH/2, 0, (int)(LENGTH/2) + NEUTRAL_ZONE_LENGTH/2, WIDTH);
	}
	
}
