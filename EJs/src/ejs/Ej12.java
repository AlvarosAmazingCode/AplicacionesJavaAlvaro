package ejs;

import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		double r = Double.parseDouble(JOptionPane.showInputDialog("Dime el radio de tu esfera."));
		System.out.println(4/3*Math.PI*r*r*r + " es el volumen de la esfera.");
	}

}
