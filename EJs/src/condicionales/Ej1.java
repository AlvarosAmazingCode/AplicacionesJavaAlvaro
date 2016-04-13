package condicionales;

import javax.swing.JOptionPane;

public class Ej1 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("dime un numero"));
		if(n > -1){
			System.out.println("es positivo"); 
		}else{
			System.out.println("Es negativo");
		}

	}

}
