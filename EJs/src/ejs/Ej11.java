package ejs;

import javax.swing.JOptionPane;

public class Ej11 {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("1er cateo"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("2do cateo"));
		
		System.out.println(a*a+b*b + (" es la hipotenusa."));
		
	}

}
