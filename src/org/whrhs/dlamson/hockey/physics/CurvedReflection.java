package org.whrhs.dlamson.hockey.physics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class CurvedReflection extends JPanel{
	
	public static final int RAD = 50;
	public static final int DIM = 500;
	private int[] coords = new int[2];
	private double[] unitVector = new double[2];
	
	public CurvedReflection() {
		setPreferredSize(new Dimension(DIM, DIM));
		setBackground(new Color(200, 150, 255));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawRoundRect(RAD, RAD, RAD*5, RAD*5, RAD, RAD);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Reflection");
		frame.setSize(DIM, DIM);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new CurvedReflection());
		frame.setVisible(true);
	}

}
