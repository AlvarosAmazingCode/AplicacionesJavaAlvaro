package ds;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	float x = 0f;
	float y = 0f;
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.fillOval((int)x, (int)y, 100, 100);
		x = x + 0.2143f;
		y = y + 0.1f;
		
		g.fillOval((int)x, (int)y, 100, 100);
		x = x + 0.2f;
		y = y + 0.1f;
		repaint();
		
	}

}
