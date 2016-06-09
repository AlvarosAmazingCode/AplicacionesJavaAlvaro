package ball;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{
	float vy[] = {0.5f, 0.4f, 0.6f, 0.3f, 0.7f};
	float vx[] = {0.2f, 0.1f, 0.3f, 0.5f, 0.6f};
	
	float x[] = {300f, 200f, 250f, 230f, 270f};
	float y[] = {300f, 250f, 270f, 280f, 290f};
	
	
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
		x[0] = x[0] + vy[0];
		y[0] = y[0] - vx[0];
		repaint();
		
		if(y[0] <= 50f){
			vy[0] = -0.5f;
			vx[0] = -0.3f;
		
		}
		else if(y[0] >= (600f - 50f)){
			vy[0] = 0.4f;
			vx[0] = 0.1f;
		}
		else if(x[0] < 50f){
			vy[0] = 0.6f;
			vx[0] = -0.7f;
			
		}
		else if(x[0] > (600f - 50f)){
			vy[0] = -0.2f;
			vx[0] = 0.5f;
		}
		
		g.setColor(Color.BLUE);
		g.fillOval((int)x[1], (int) y[1], 50, 50);
		x[1] = x[1] + vy[1];
		y[1] = y[1] - vx[1];
		repaint();
		
		if(y[1] <= 50f){
			vy[1] = -0.7f;
			vx[1] = -0.5f;
		
		}
		else if(y[1] >= (600f - 50f)){
			vy[1] = 0.6f;
			vx[1] = 0.4f;
		}
		else if(x[1] < 50f){
			vy[1] = 0.8f;
			vx[1] = -0.9f;
			
		}
		else if(x[1] > (600f - 50f)){
			vy[1] = -0.5f;
			vx[1] = 0.2f;
		}
		
		g.setColor(new Color(200, 200, 100));
		g.fillRect((int)x[2], (int) y[2], 60, 60);
		x[2] = x[2] + vy[2];
		y[2] = y[2] - vx[2];
		repaint();
		
		if(y[2] <= 50f){
			vy[2] = -0.7f;
			vx[2] = -0.5f;
		
		}
		else if(y[2] >= (600f - 60f)){
			vy[2] = 0.6f;
			vx[2] = 0.4f;
		}
		else if(x[2] < 50f){
			vy[2] = 0.8f;
			vx[2] = -0.9f;
			
		}
		else if(x[2] > (600f - 60f)){
			vy[2] = -0.5f;
			vx[2] = 0.2f;
		}
		g.setColor(Color.GRAY);
		g.fillOval((int)x[3], (int) y[3], 100, 50);
		x[3] = x[3] + vy[3];
		y[3] = y[3] - vx[3];
		repaint();
		
		if(y[3] <= 50f){
			vy[3] = -1.7f;
			vx[3] = -0.5f;
		
		}
		else if(y[3] >= (600f - 50f)){
			vy[3] = 0.5f;
			vx[3] = 0.5f;
		}
		else if(x[3] < 50f){
			vy[3] = 0.8f;
			vx[3] = -1.9f;
			
		}
		else if(x[3] > (600f - 100f)){
			vy[3] = -0.1f;
			vx[3] = 1f;
		}
		g.setColor(Color.CYAN);
		g.fillOval((int)x[4], (int) y[4], 50, 50);
		x[4] = x[4] + vy[4];
		y[4] = y[4] - vx[4];
		repaint();
		
		if(y[4] <= 50f){
			vy[4] = -0.7f;
			vx[4] = -0.5f;
		
		}
		else if(y[4] >= (600f - 50f)){
			vy[4] = 0.6f;
			vx[4] = 0.4f;
		}
		else if(x[4] < 50f){
			vy[4] = 0.8f;
			vx[4] = -0.9f;
			
		}
		else if(x[4] > (600f - 50f)){
			vy[4] = -0.5f;
			vx[4] = 0.2f;
		}
	}
}
