package ejs;

import javax.swing.JOptionPane;

public class Ej15 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero de 5 cifras."));
		int t = n % 10;
		int k = ((n % 100) - t)/10;
		int g = ((n%1000)-k)/100;
		int y = ((n % 10000)-g)/1000;
		int j = n / 10000;
		System.out.println(t + " " + k + " " + g + " " + y +" " + j);
	}

}
