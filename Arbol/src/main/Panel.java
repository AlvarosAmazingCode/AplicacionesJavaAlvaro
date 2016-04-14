package main;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {
	
	Arbol a;
	
	public Panel(){
		
		Punto p1 = new Punto(900f, 700f);
		Punto p2 = new Punto(900f, 600f);
			
		a = new Arbol(p1, p2);
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					repaint();
					
				}
				
			}
		});
		t.start();
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		a.dibujar(g);
	}
	
	
}
