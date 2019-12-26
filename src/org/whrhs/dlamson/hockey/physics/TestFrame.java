package org.whrhs.dlamson.hockey.physics;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class TestFrame extends JFrame{

	public TestFrame() {
		
		add(new TestPanel());
		
		setSize(550, 550);
		setTitle("Physics Test");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] pizza) {
		EventQueue.invokeLater(() -> {
			TestFrame app = new TestFrame();
			app.setVisible(true);
		});
	}
}
