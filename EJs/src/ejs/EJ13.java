package ejs;

import javax.swing.JOptionPane;

public class EJ13 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero de 3 digitos."));
		int centenas = n / 100;
		int decenas = n % 100;
		int unidades = n % 10;
	    System.out.println(centenas + " " + ((decenas - unidades)/10) + " " + unidades);

	}

}
