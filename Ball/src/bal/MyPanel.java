package bal;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	float y = 600;
	float x = 0;
		
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval((int)x, (int) y, 100, 100);
		x = x + 0.6f;
		y = y - 0.6f;
		repaint();
	}
}
