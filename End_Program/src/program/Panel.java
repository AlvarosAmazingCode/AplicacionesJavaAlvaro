package program;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Panel extends JPanel{
	float vy = 0.4f;
	float vx = 0.1f;
	
	float x = 200f;
	float y = 250f;
	int n;
	
	public int l(int n){
		return n;
		
		
		
	}
	
	public int a = n;
	
	public void paint(Graphics g){
		super.paint(g);
		while(a > 1){
		g.setColor(Color.BLUE);
		g.fillOval((int)x, (int) y, 50, 50);
		x = x + vy;
		y = y - vx;
		repaint();
		
		if(y < 0){
			vy = 0.7f;
			vx = -0.5f;
		
		}
		else if(y > (980 - 50)){
			vy = -0.6f;
			vx = 0.4f;
		}
		else if(x < 0){
			vy = 0.9f;
			vx = 0.8f;
			
		}
		else if(x > (1890 - 50)){
			vy = -0.5f;
			vx = -0.2f;
		}
		
	}
	}
}
	
	
	
	


	
	




