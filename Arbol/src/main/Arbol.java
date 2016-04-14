package main;

import java.awt.Graphics;
import java.awt.Polygon;

public class Arbol {
	private static final float GRADOS = 60;
	private static final float FACTOR_HIJOS = 0.83f;
	private static final float FACTOR_ANCHO = 0.1f;
	
	private Punto pIni;
	private Punto pFin;
	
	private Arbol r1;
	private Arbol r2;


	public Arbol(Punto pIni, Punto pFin) {
		this.pIni = pIni;
		this.pFin = pFin;
		
		generarHijos();
	}

	
	private void generarHijos() {
		Vector v = new Vector (pFin.x-pIni.x, pFin.y-pIni.y); 
		
		if(v.modulo()>10){
			
			v.x = v.x*FACTOR_HIJOS;
			v.y = v.y*FACTOR_HIJOS;
			
			v.rotar(GRADOS);
			Punto pn1 = new Punto(pFin.x+v.x, pFin.y+v.y);
			
			if(r1 == null){
				r1 = new Arbol (pFin, pn1);
			}
			v.rotar(-(GRADOS*2));
			Punto pn2 = new Punto(pFin.x+v.x, pFin.y+v.y);
			
			if(r2 == null){
				r2 = new Arbol (pFin, pn2);
			}
		}
		
	}


	


	public void dibujar(Graphics g) {
		Vector v = new Vector (pFin.x-pIni.x, pFin.y-pIni.y); 
		Vector p = new Vector (-v.y*FACTOR_ANCHO, v.x*FACTOR_ANCHO);
		
		Punto p1 = new Punto(pIni.x+p.x, pIni.y+p.y);
		Punto p4 = new Punto(pIni.x-p.x, pIni.y-p.y);
		
		Punto p2 = new Punto(pFin.x+p.x, pFin.y+p.y);
		Punto p3 = new Punto(pFin.x-p.x, pFin.y-p.y);
		
		Polygon tronco = new Polygon();
		 tronco.addPoint((int)p1.x, (int)p1.y);
		 tronco.addPoint((int)p2.x, (int)p2.y);
		 tronco.addPoint((int)p3.x, (int)p3.y);
		 tronco.addPoint((int)p4.x, (int)p4.y);
		 
		 g.fillPolygon(tronco);
		 if(r1 !=null){
			 r1.dibujar(g);
		 }
		 if(r2 !=null){
			 r2.dibujar(g);
		 }
		
	}


		
	}


