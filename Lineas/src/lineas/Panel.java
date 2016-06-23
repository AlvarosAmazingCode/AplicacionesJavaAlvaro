package lineas;

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
import javax.xml.bind.ParseConversionEvent;

public class Panel extends JPanel{
	Random r = new Random();
	int anchoPantalla = Toolkit.getDefaultToolkit().getScreenSize().width;
	int altoPantalla = Toolkit.getDefaultToolkit().getScreenSize().height;
	int sizeEnemy = 50;
	int score = 0;
	int escape = 0;
	int xEnemy = 200;
	int yEnemy = 200;
	float mousex;
	float mousey;



	public Panel() {
		addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {
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
				if(key == 'w'){
					yEnemy -= 100;

				}
				if(key == 's'){
					yEnemy += 100;

				}
				if(key == 'd'){
					xEnemy += 100;

				}
				if(key == 'a'){
					xEnemy -= 100;

				}
				if(key == ' '){
					escape++;
					if(escape < 2){
						xEnemy = (int) (Math.random()*altoPantalla) ;
						yEnemy = (int) (Math.random()*anchoPantalla);
						score += 8;
						
					}else{

					}
				}

			}
		});
	}


	@Override
	public void paint (Graphics g){
		super.paint(g);
		g.setColor(new Color(164, 42, 42));
		g.fillRect(0, 800, 1920, 500);

		g.setColor(new Color(100, 255, 10));
		g.setFont(new Font("Comic Sans MS",Font.ITALIC , 50));
		g.drawString("Score- " + score, 10, 60);

		g.setColor(new Color(200, 0, 10));
		g.setFont(new Font("Comic Sans MS",Font.BOLD , 50));
		g.drawString(escape < 3? "Escape- " + escape : "Escape- Wasted", 1400, 60);
		setBackground(new Color(0, 40, 60));


		g.setColor(new Color(255, 255, 0));
		g.fillRect(xEnemy, yEnemy, sizeEnemy, sizeEnemy);
		if(mousex > xEnemy && mousex < xEnemy+sizeEnemy && mousey > yEnemy && mousey < yEnemy+sizeEnemy){

			score ++;

		}
		if(yEnemy < 50){
			yEnemy = altoPantalla-sizeEnemy;
		}
		if(yEnemy > altoPantalla-sizeEnemy){
			yEnemy = 49;
		}
		for(int i=0;i< 500;i++){
			g.setColor(new Color(255, 50, 0));//Color de lineas
			g.drawLine(0, i+300, (int) Math.ceil(mousex), (int) Math.ceil(mousey));//primera linea
			g.drawLine((int) Math.ceil(mousex), (int) Math.ceil(mousey), anchoPantalla, i+300);//segunda linea


		}



		repaint();//Repintar


	}

}
