package org.whrhs.dlamson.hockey.physics;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class PhysicsFrame extends JFrame{
	
	public PhysicsFrame() {
		setSize(PhysicsPanel.W, PhysicsPanel.H);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(new PhysicsPanel());
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			PhysicsFrame frame = new PhysicsFrame();
			frame.setVisible(true);
		});
	}
}
