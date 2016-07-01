package photon_canon;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Panel extends JPanel{
	private String name;
	
	public Panel(String n){
		name = n;
	}

	int anchoPantalla = Toolkit.getDefaultToolkit().getScreenSize().width;
	int altoPantalla = Toolkit.getDefaultToolkit().getScreenSize().height;
	int sizeEnemy = 60;
	int score = 0;
	int escape = 0;
	int xEnemy = 200;
	int yEnemy = 200;
	float mousex, mousey;
	int level;
	int escapeLimit = 3;
	int content = 0;

	public Panel() {
		
		addMouseMotionListener(new MouseMotionAdapter() {//this adds a mouse motion listener
			
			@Override
			public void mouseMoved(MouseEvent e) {//If the mouse is moved it sets the variables of mouse position to the mouse position
				mousex=e.getX();
				mousey=e.getY();

			}

		});
		setFocusable(true);
		requestFocus();
		addKeyListener(new  KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char key  = e.getKeyChar();
				System.out.println(key);
				if(level > 10 && e.getKeyCode() == e.VK_F1 && escape == 0){
					score = 12000000;
					escape = 0;
					level = 12000;
					escapeLimit = 12000000;
					content = 1;
					}
				if(key == 'r' || key == 'R'){
					level = 0;
					score = 0;
					escape = 0;
					xEnemy = 200;
					yEnemy = 200;
					sizeEnemy = 60;
					content = 0;
				}
				if(key == 'w' || key == 'W'){
					yEnemy -= 100;

				}
				if(key == 's' || key == 'S'){
					yEnemy += 100;

				}
				if(key == 'd' || key == 'D'){
					xEnemy += 100;

				}
				if(key == 'a' || key == 'A'){
					xEnemy -= 100;
					
				}
				if(key == ' '){
					escape++;
					if(escape <= escapeLimit){
						xEnemy = (int) (Math.random()*altoPantalla) ;
						yEnemy = (int) (Math.random()*anchoPantalla);
						score += 8;
						
					}
				}

			}
		});
	}


	
	@Override
	public void paint (Graphics g){
		switch(level){
			case 1:
				sizeEnemy = 55;
			break;
			
			case 2:
				sizeEnemy = 53;
			break;
			
			case 4:
				sizeEnemy = 51;
			break;
			
			case 8:
				sizeEnemy = 49;
			break;
			
			case 16:
				sizeEnemy = 47;
			break;
			
		}
		super.paint(g);
		setBackground(new Color(0, 40, 60));

		g.setColor(new Color(100, 255, 10));
		g.setFont(new Font("Comic Sans",Font.BOLD , 50));
		g.drawString("Score- " + score, 50, 60);

		g.setColor(new Color(200, 0, 10));
		g.setFont(new Font("Comic Sans MS",Font.BOLD , 50));
		g.drawString(escape <= escapeLimit-1? "Escape- " + escape : "Escape- Wasted", 960, 60);
		g.setColor(Color.CYAN);
		g.drawString(level + "", 580, 60);

		g.setColor(new Color(164, 42, 42));
		g.fillRect(0, 500, 2090, 900);
		
		g.setColor(new Color(255, 255, 0));
		g.fillRect(xEnemy, yEnemy, sizeEnemy, sizeEnemy);
		if(mousex > xEnemy && mousex < xEnemy+sizeEnemy && mousey > yEnemy && mousey < yEnemy+sizeEnemy){

			score ++;
			if(score > 1000){
				level = (int) (score/1000);
			}

		}
		if(yEnemy < 50){
			yEnemy = altoPantalla-sizeEnemy-(sizeEnemy/2);
		}
		if(yEnemy > altoPantalla-sizeEnemy){
			yEnemy = 56;
		}
		if(xEnemy < 0){
			xEnemy = anchoPantalla-sizeEnemy-1;
		}if(xEnemy > anchoPantalla-sizeEnemy){
			xEnemy = 0;
		}
		
		for(int i=1;i< 501;i++){
			if((i%2) == 0 && content == 1){
				g.setColor(new Color(200, 200, 200));
			}else if(content == 1){
				g.setColor(Color.BLACK);
			}else{
				g.setColor(new Color(250, 50, 0));
			}
			g.drawLine(0, i+300, (int) Math.ceil(mousex), (int) Math.ceil(mousey));//primera linea
			g.drawLine((int) Math.ceil(mousex), (int) Math.ceil(mousey), anchoPantalla, i+300);//segunda linea
			

		}

		if(content == 1){
			g.setColor(Color.RED);
			g.drawLine(xEnemy+(sizeEnemy /2), 0, xEnemy+(sizeEnemy /2), 10000);
			g.drawLine(0, yEnemy+(sizeEnemy /2), 10000, yEnemy+(sizeEnemy /2));
			g.drawOval(xEnemy+(sizeEnemy /2)-10, yEnemy+(sizeEnemy /2)-10, 20, 20);
			g.fillOval((int)(xEnemy+(sizeEnemy /2)-2.5), (int)(yEnemy+(sizeEnemy /2)-2.5), 5, 5);
		}

		repaint();


	}

}