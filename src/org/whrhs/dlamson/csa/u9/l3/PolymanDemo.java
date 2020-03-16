package org.whrhs.dlamson.csa.u9.l3;

import java.awt.EventQueue;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PolymanDemo extends JFrame{
	
	public PolymanDemo() {
		add(new PolymanPanel());
		setSize(PolymanPanel.W, PolymanPanel.H);
		setTitle("Polymorphic Man of Mystery");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
			PolymanDemo game = new PolymanDemo();
			game.setVisible(true);
		});
	}
}
