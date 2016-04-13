package ejs;

import javax.swing.JOptionPane;

public class Ej14 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero de 5 cifras."));
		int c =  n / 10000;
		int v = n % 10000;
		int y = n % 1000;
		int x = n % 100;
		int k = n % 10;
		int t = n % 10;
		System.out.println(c + " " + (v - y)/1000 + " " + (y - x)/ 100 + " " + (x-k)/ 10 + " " + t);
	}

}
