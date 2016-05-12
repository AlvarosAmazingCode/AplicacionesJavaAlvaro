package lineas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel extends JPanel{

	int anchoPantalla = Toolkit.getDefaultToolkit().getScreenSize().width;
	float x = 5f;//Valores de linea de abajo
	float y = 540f;//Valores de linea de arriba
	int estado = 0;
	float velocidadPrimeraLinea =1;
	float velocidadSegundaLinea =1;
	//private int numeroDeLineas;

	
	/*public Panel(int numeroDeLineas) {
		this.numeroDeLineas = numeroDeLineas;
	}*/


	@Override
	public void paint (Graphics g){
		setBackground(new Color(250,255,115));
		super.paint(g);
		setBackground(new Color(250,255,115));//Color de la pantalla

		
		g.setColor(new Color(255, 10, 10));//Color de linea de arriba
		for(int i=0;i< 3;i++){
			g.drawLine(0, i*50+480, (int) x, i*50+480);//primera linea
			g.drawLine((int)(anchoPantalla- x), i*50+505, anchoPantalla, i*50+505);//segunda linea
			
			
		}
		
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
