package condicionales;

import javax.swing.JOptionPane;

public class Ej6 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero"));
		if(a > b && a > c){
			System.out.println(a + " es el mayor");
	}else{
		if(b > a && b > c){
			System.out.println(b + " es el mayor");
	}else{
		System.out.println(c + " es el mayor");
	}
	}
	}
	}



