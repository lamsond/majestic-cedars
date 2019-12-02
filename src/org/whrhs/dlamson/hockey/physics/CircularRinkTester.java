package org.whrhs.dlamson.hockey.physics;

import java.awt.EventQueue;
import javax.swing.JFrame;

import org.whrhs.dlamson.hockey.HockeyPanel;

public class CircularRinkTester extends JFrame{
	
	public CircularRinkTester() {
		add(new CircularRinkPanel());
		
		setTitle("Circle Tester");
		setSize(CircularRinkPanel.DIM, CircularRinkPanel.DIM);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			CircularRinkTester test = new CircularRinkTester();
			test.setVisible(true);
		});
	}

}
