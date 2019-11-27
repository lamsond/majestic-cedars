package org.whrhs.dlamson.hockey;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class HockeyGame extends JFrame{
	
	public HockeyGame() {
		add(new HockeyPanel());
		
		setTitle("Yes! Yes! Yes!");
		setSize(HockeyPanel.LENGTH, HockeyPanel.WIDTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			HockeyGame game = new HockeyGame();
			game.setVisible(true);
		});
	}

}
