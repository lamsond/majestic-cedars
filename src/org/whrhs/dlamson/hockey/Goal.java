package org.whrhs.dlamson.hockey;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Goal {

	public static final int WIDTH = 6*Ice.SF;
	public static final int DEPTH = 4*Ice.SF;
	
	public Goal() {
		
	}
	
	public void draw(Graphics2D g, int xOffset, int yOffset) {
		int[][] points = {
				{Ice.BACKLINE_LENGTH + xOffset, Ice.WIDTH/2 + WIDTH/2 + yOffset},
				{Ice.BACKLINE_LENGTH + xOffset - DEPTH, Ice.WIDTH/2 + WIDTH/2 + yOffset},
				{Ice.BACKLINE_LENGTH + xOffset - DEPTH, Ice.WIDTH/2 - WIDTH/2 + yOffset},
				{Ice.BACKLINE_LENGTH + xOffset, Ice.WIDTH/2 - WIDTH/2 + yOffset}
		};
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(3));
		g.drawLine(points[0][0], points[0][1], points[1][0], points[1][1]);
		g.drawLine(points[1][0], points[1][1], points[2][0], points[2][1]);
		g.drawLine(points[2][0], points[2][1], points[3][0], points[3][1]);
	}
}
