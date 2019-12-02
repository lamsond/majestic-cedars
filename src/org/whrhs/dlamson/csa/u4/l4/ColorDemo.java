package org.whrhs.dlamson.csa.u4.l4;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ColorDemo extends JFrame{
	
	private JPanel panel;
	private Color color;
	private JLabel label;
	
	public ColorDemo() {
		panel = new JPanel();
		label = new JLabel("");
		label.setFont(new Font("Arial", Font.BOLD, 216));
		panel.add(label);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300, 300);
	}
	
	public void setNum(int n) {
		label.setText(n + "");
	}
	
	public void setColor(Color c) {
		panel.setBackground(c);
	}
	
	public void mystery(int n, Color c) {
		n = 7;
		c = new Color(100, 100, 100);
	}

	public static void main(String[] args) {
		int n = 5;
		Color pizza = new Color(255, 255, 255);
		
		ColorDemo frame = new ColorDemo();
		frame.mystery(n, pizza);
		
		frame.setNum(n);
		frame.setColor(pizza);
		frame.setVisible(true);
	}
}
