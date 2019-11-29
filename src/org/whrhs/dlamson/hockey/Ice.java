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
	public static final int FACEOFF_RAD = 15*SF;
	public static final int CREASE_RAD = 6*SF;
	
	public Ice() {
		
	}
	
	public void draw(Graphics2D g, int xOffset, int yOffset) {
		g.setColor(Color.RED);
		g.setStroke(new BasicStroke(3));
		g.drawLine((int)(LENGTH/2) + xOffset, yOffset, (int)(LENGTH/2) + xOffset, WIDTH + yOffset);
		g.drawLine(BACKLINE_LENGTH + xOffset, yOffset, BACKLINE_LENGTH + xOffset, WIDTH + yOffset);
		g.drawLine(LENGTH-BACKLINE_LENGTH + xOffset, yOffset, LENGTH-BACKLINE_LENGTH + xOffset, WIDTH + yOffset);
		
		g.setColor(Color.BLUE);
		g.drawLine((int)(LENGTH/2) - NEUTRAL_ZONE_LENGTH/2 + xOffset, yOffset, (int)(LENGTH/2) - NEUTRAL_ZONE_LENGTH/2 + xOffset, WIDTH + yOffset);
		g.drawLine((int)(LENGTH/2) + NEUTRAL_ZONE_LENGTH/2 + xOffset, yOffset, (int)(LENGTH/2) + NEUTRAL_ZONE_LENGTH/2 + xOffset, WIDTH + yOffset);
		
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(3));
		g.draw(new RoundRectangle2D.Double(xOffset, yOffset, LENGTH, WIDTH, RAD, RAD));
		
		int attackZoneX = (BACKLINE_LENGTH + (LENGTH/2 - NEUTRAL_ZONE_LENGTH/2))/2;
		int attackZoneY = FACEOFF_RAD + 30;
		drawFaceOff(g, attackZoneX + xOffset, attackZoneY + yOffset, Color.RED);
		drawFaceOff(g, attackZoneX + xOffset, WIDTH-attackZoneY + yOffset, Color.RED);
		drawFaceOff(g, LENGTH-attackZoneX + xOffset, WIDTH-attackZoneY + yOffset, Color.RED);
		drawFaceOff(g, LENGTH-attackZoneX + xOffset, attackZoneY + yOffset, Color.RED);
		drawFaceOff(g, LENGTH/2 + xOffset, WIDTH/2 + yOffset, Color.BLUE);
		
		drawCreases(g, BACKLINE_LENGTH + xOffset, WIDTH/2 + yOffset, Color.RED, Color.BLUE);
	}
	
	private void drawFaceOff(Graphics2D g, int x, int y, Color c) {
		g.setColor(c);
		g.setStroke(new BasicStroke(2));
		g.drawArc(x - FACEOFF_RAD, y - FACEOFF_RAD, FACEOFF_RAD*2, FACEOFF_RAD*2, 0, 360);
		g.fillArc(x-SF, y-SF, SF*2, SF*2, 0, 360);
	}
	
	private void drawCreases(Graphics2D g, int x, int y, Color cOutline, Color cFill) {
		g.setColor(cFill);
		g.fillArc(x - CREASE_RAD, y - CREASE_RAD, CREASE_RAD*2, CREASE_RAD*2, 90, -180);
		g.fillArc(x - CREASE_RAD + (LENGTH - 2*BACKLINE_LENGTH), y - CREASE_RAD, CREASE_RAD*2, CREASE_RAD*2, 90, 180);
		g.setColor(cOutline);
		g.setStroke(new BasicStroke(3));
		g.drawArc(x - CREASE_RAD, y - CREASE_RAD, CREASE_RAD*2, CREASE_RAD*2, 90, -180);
		g.drawArc(x - CREASE_RAD + (LENGTH - 2*BACKLINE_LENGTH), y - CREASE_RAD, CREASE_RAD*2, CREASE_RAD*2, 90, 180);
	}
	
	
}
