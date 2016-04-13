package condicionales;

import javax.swing.JOptionPane;

public class Ej5 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Dime una frase");
		String b = JOptionPane.showInputDialog("Dime otra frase");
		
		if(a.equals(b) ){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
	}

}
