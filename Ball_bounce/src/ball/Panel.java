package ball;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{
	float vy = 0.2f;
	float vx = 0.1f;
	
	float x[] = {600f};
	float y[] = {700f};
	
	
	@Override
	public void paint (Graphics g){
		super.paint(g);
		setBackground(Color.BLACK);
		
		g.setColor(Color.RED);
		g.drawLine(50, 50, 50, 600);
		g.drawLine(50, 600, 600, 600);
		g.drawLine(600, 600, 600, 50);
		g.drawLine(600, 50, 50, 50);
		
		g.fillOval((int)x[0], (int) y[0], 50, 50);
		x[0] = x[0] + vy;
		y[0] = y[0] - vx;
		repaint();
		
		if(y[0] <= 50f){
			vy = -0.5f;
			vx = -0.2f;
		
		}
		else if(y >= 600 - 50){
			vy = 0.5f;
			vx = 0.2f;
		}
		
	}
}
