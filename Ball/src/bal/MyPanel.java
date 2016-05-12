package bal;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel{
	float y = 700f;
	float x = 600f;
	
	float vy = 0.5f;
	float vx = 0.2f;
	
	float anchoBola = (int)(Math.random()*150);
	float altoBola = (int)(Math.random()*150);
	Color c = Color.BLUE ;
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Color.GRAY);
			g.setColor(c);
			g.fillOval((int)x, (int) y, (int)altoBola, (int)altoBola);
			x = x + vy;
			y = y - vx;
			repaint();
			
			if(y < 0 ){
				anchoBola = (int)(Math.random()*130);
				altoBola = (int)(Math.random()*130);
				vy = -0.5f;
				vx = -0.2f;
				c = Color.RED;
			}
			
			if(y > 870 - altoBola){
				anchoBola = (int)(Math.random()*160);
				altoBola = (int)(Math.random()*160);
				vy = 0.5f;
				vx = 0.2f;
				c = Color.GREEN;
			}
			if(x > 1830 - anchoBola/2){
				anchoBola = (int)(Math.random()*190);
				altoBola = (int)(Math.random()*190);
				vy = -0.5f;
				vx = 0.2f;
				c = Color.YELLOW;
			}
			if(x < 0){
				anchoBola = (int)(Math.random()*200);
				altoBola = (int)(Math.random()*200);
				vy = 0.5f;
				vx = -0.2f;
				c = Color.CYAN;
			}
			
		
		
		
	}
}
