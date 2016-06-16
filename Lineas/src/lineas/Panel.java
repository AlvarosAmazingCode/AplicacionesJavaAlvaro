package lineas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel extends JPanel{
	Random r = new Random();
	int anchoPantalla = Toolkit.getDefaultToolkit().getScreenSize().width;

	float x = 5f;//Valores de linea de abajo
	float y = 540f;//Valores de linea de arriba
	float mousex;
	float mousey;
	int estado = 0;
	float velocidadPrimeraLinea =1;
	float velocidadSegundaLinea =1;
	//private int numeroDeLineas;

	
	public Panel() {
		addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {
				mousex=e.getX();
				mousey=e.getY();
			}
			
		});
	}


	@Override
	public void paint (Graphics g){
		super.paint(g);
		g.setColor(new Color(164, 42, 42));
		g.fillRect(0, 800, 1920, 500);
		setBackground(new Color(0, 40, 60));
		
		
		
		
		for(int i=0;i< 500;i++){
			g.setColor(new Color(255, 50, 0));//Color de lineas
			g.drawLine(0, i+300, (int) Math.ceil(mousex), (int) Math.ceil(mousey));//primera linea
			g.drawLine((int) Math.ceil(mousex), (int) Math.ceil(mousey), anchoPantalla, i+300);//segunda linea
			
			
		}
		g.setColor(new Color(255, 0, 0));
		g.fillOval(200, 200, 20, 20);
		x = x + velocidadPrimeraLinea;
		if(x > anchoPantalla){
			velocidadPrimeraLinea  = -1f;
			
		}
		if(x < 0){
			velocidadPrimeraLinea  = 1f;
			
		}
		
		repaint();//Repintar


	}

}
