package condicionales;

import javax.swing.JOptionPane;

public class Ej11 {

	public static void main(String[] args) {
int i = Integer.parseInt(JOptionPane.showInputDialog("dime un caracter"));
		

		if(i < 97){
			System.out.println("La letra es mayuscula.");
		}else{
			System.out.println("Es minuscula");
		}

	}

}
